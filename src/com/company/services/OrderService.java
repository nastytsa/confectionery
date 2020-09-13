package com.company.services;

import com.company.entities.Bill;
import com.company.entities.Stock;
import com.company.entities.Client;
import com.company.entities.dessertName;
import com.company.staff.Cook;
import com.company.staff.Salesman;


public class OrderService {

    private final Bill bill;
    private final Client client;
    private final Salesman salesman;
    private final Cook cook;

    public OrderService(Client client, Salesman salesman, Cook cook, ReportService reportService){
        this.client = client;
        this.salesman = salesman;
        this.cook = cook;
        bill = new Bill(client.getOrder(), client.getMasterClass());
        addToReport(reportService);
        reportService.addMasterclass(client.getMasterClass().getDuration());
    }

    public boolean checkStock(Stock stock, int i){
        return stock.checkDessert(bill.getDessertName(i));
    }

    public void serveDessert(Stock stock){
        for(int i = 0; i < bill.getNumOrders(); i++){
            if(!checkStock(stock, i))
                continue;
            stock.removeDessert(bill.getDessertName(i));
        }
    }

    public String checkMasterClass(ReportService reportService){
        int duration = client.getMasterClass().getDuration();
        if(duration==0)
            return "";
        reportService.addMasterclass(duration);
        return cook.speak();
    }

    public Bill getBill(){
        return bill;
    }

    public void addToReport(ReportService reportService){
        for(int i = 0; i < getBill().getNumOrders(); i++){
            if(getBill().getDessertName(i) == dessertName.CHEESECAKE)
                reportService.addCheesecake();
            else if(getBill().getDessertName(i) == dessertName.NAPOLEON)
                reportService.addNapoleon();
            else
                reportService.addTiramisu();
        }
    }

    public String info(){
        StringBuilder info = new StringBuilder();
        info.append("\nSalesman: " + salesman.getName() + " " + salesman.getSurname())
                .append("\nCustomer: " + client.getName() + " " + client.getSurname())
                .append("\nPrice: " + bill.getOrderPrice() + "\n");
        return info.toString();
    }
}

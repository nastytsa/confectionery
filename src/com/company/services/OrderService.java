package com.company.services;

import com.company.entities.Bill;
import com.company.entities.Salesman;
import com.company.entities.Client;
import com.company.entities.Cook;
import com.company.entities.Stock;


public class OrderService {

    private final Bill bill;
    private final Client client;
    private final Salesman salesman;
    private Cook cook;

    public OrderService(Client client, Salesman salesman){
        this.client = client;
        this.salesman = salesman;
        bill = new Bill(client.getOrder(), client.getMasterClass());
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

    public void checkMasterClass(ReportService reportService){
        int duration = client.getMasterClass().getDuration();
        if(duration!=0){
            reportService.addMasterclass(duration);
        }
    }

    public String info(){
        StringBuilder info = new StringBuilder();
        info.append("\nSalesman: " + salesman.getName() + salesman.getSurname())
                .append("\nCustomer: " + client.getName() + client.getSurname())
                .append("\nPrice: " + bill.getOrderPrice() + "\n");
        return info.toString();
    }
}

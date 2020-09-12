package com.company.services;
import com.company.entities.Bill;
import com.company.entities.Salesman;
import com.company.entities.Client;
import com.company.entities.Cook;
import com.company.entities.Stock;


public class OrderService {

    private Bill bill;
    private Client client;
    private Salesman salesman;
    private Cook cook;

    public OrderService(Client client, Salesman salesman){
        this.client = client;
        this.salesman = salesman;
        bill = new Bill(client.getOrder());
    }

    public void checkStock(Stock stock){
        boolean singleWaiting = true;
        for(int i = 0; i < bill.getNumOrders(); i++){
            if(stock.checkDessert( bill.getDessertName(i) ))
                stock.removeDessert(bill.getDessertName(i));
            else if(singleWaiting){
                salesman.waiting();
                singleWaiting = false;
            }
        }
    }

    public void checkMasterClass(){
        if(client.getMasterClassDuration()!=0)
            cook.speak();
    }
}

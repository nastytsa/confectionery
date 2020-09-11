package com.company.services;
import com.company.entities.*;

public class OrderService {

    private Bill bill;
    private Client client;

    public OrderService(Client client){
        this.client = client;
        bill = new Bill(client.getOrder());
    }


}

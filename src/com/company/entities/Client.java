package com.company.entities;
import java.util.ArrayList;

public final class Client extends Human{
    private ArrayList<Order> order;
    public Client(String name, String surname) {
        super(name, surname);
        this.order = new ArrayList<>();
    }

    public void addOrder(Order newOrder){
        order.add(newOrder);
    }

    public ArrayList<Order> getOrder(){
        return this.order;
    }
}

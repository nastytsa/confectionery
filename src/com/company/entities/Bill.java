package com.company.entities;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bill {

    private ArrayList<Order> order;
    private double price;
/*
    public Bill(Order firstPurchase){
        order = new ArrayList<>();
        order.add(firstPurchase);
        this.price = firstPurchase.getPrice();
    }
*/

    public Bill(ArrayList<Order> orders){
        order = orders;
    }

    public void addPurchase(Order newOrder){
        order.add(newOrder);
        this.price += newOrder.getPrice();
    }

    public double getPrice(){
        return this.price;
    }
}

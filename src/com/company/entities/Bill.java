package com.company.entities;
import java.util.ArrayList;

public class Bill {

    private ArrayList<Order> purchases;
    private double price;

    public Bill(Order firstPurchase){
        purchases = new ArrayList<>();
        purchases.add(firstPurchase);
        this.price = firstPurchase.getPrice();
    }

    public void addPurchase(Order newOrder){
        purchases.add(newOrder);
        this.price += newOrder.getPrice();
    }

    public double getPrice(){
        return this.price;
    }
}

package com.company.entities;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bill {

    private ArrayList<Dessert> order;
    private double price;
/*
    public Bill(Order firstPurchase){
        order = new ArrayList<>();
        order.add(firstPurchase);
        this.price = firstPurchase.getPrice();
    }
*/

    public Bill(ArrayList<Dessert> orders){
        order = orders;
    }

    public void addPurchase(Dessert newOrder){
        order.add(newOrder);
        this.price += newOrder.getPrice();
    }

    public double getPrice(){
        return this.price;
    }

    public int getNumOrders(){
        return order.size();
    }

    public dessertName getDessertName(int index){
        return order.get(index).getName();
    }
}

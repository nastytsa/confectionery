package com.company.entities;
import java.util.ArrayList;

public class Bill {

    private ArrayList<Dessert> order;
    private final MasterClass masterClass;
    private double price;

    public Bill(ArrayList<Dessert> orders, MasterClass masterClass){
        order = orders;
        this.masterClass = masterClass;
        price = masterClass.getPrice();
        for(int i = 0; i < getNumOrders(); i++)
            price += order.get(i).getPrice();
    }

    public double getOrderPrice(){
        return this.price;
    }

    public int getNumOrders(){
        return order.size();
    }

    public dessertName getDessertName(int index){
        return order.get(index).getName();
    }

    public double getDessertPrice(int index){
        return order.get(index).getPrice();
    }
}

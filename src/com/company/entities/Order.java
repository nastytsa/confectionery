package com.company.entities;

public class Order {
    protected double price;

    public Order(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice){
        if(newPrice > 0)
            this.price = newPrice;
    }
}

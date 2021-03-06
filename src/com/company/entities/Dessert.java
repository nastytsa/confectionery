package com.company.entities;

public class Dessert {

    private final dessertName name;
    private double price;

    public Dessert(dessertName name, double price, Stock stock) {
        this.price = price;
        this.name = name;
        stock.addDessert(this.name);
    }

    public Dessert(dessertName name, double price){
        this.name = name;
        this.price = price;
    }

    public dessertName getName(){
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}

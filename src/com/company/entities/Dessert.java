package com.company.entities;

public class Dessert extends Order{

    private final String name;

    public Dessert(String name, double price) {
        super(price);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

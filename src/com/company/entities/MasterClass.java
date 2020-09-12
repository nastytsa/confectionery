package com.company.entities;

public class MasterClass {
    private int duration;
    private double price;

    public MasterClass(int duration){
        this.duration = duration;
        this.price = duration * 5;
    }

    public int getDuration(){
        return this.duration;
    }

    public double getPrice() {
        return this.price;
    }
}

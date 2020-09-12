package com.company.entities;

public class MasterClass {
    private int duration;
    private double price;

    public MasterClass(int duration){
        this.duration = duration;
        this.price = duration * 5;
    }

    int getDuration(){
        return this.duration;
    }

    void setDuration(int newDuration) {
        if ((newDuration > 0) && (newDuration < 180) && (newDuration % 30 == 0))
            this.duration = newDuration;
    }

    public double getPrice() {
        return this.price;
    }
}

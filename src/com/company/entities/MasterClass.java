package com.company.entities;

public class MasterClass extends Order{
    private int duration;

    public MasterClass(int duration, double price){
        super(price);
        this.duration = duration;
    }

    int getDuration(){
        return this.duration;
    }

    void setDuration(int newDuration){
        if ((newDuration > 0) && (newDuration < 180) && (newDuration%30 == 0))
            this.duration = newDuration;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*this.duration;
    }
}

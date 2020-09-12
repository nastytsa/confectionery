package com.company.entities;

public class Cashbox {

    private double cash;

    public Cashbox(){
        this.cash = 0.0;
    }

    public void addCash(double money){
        this.cash += money;
    }

    public double getCash(){
        return this.cash;
    }

    public void resetCash(){
        this.cash = 0;
    }
}

package com.company.entities;

public class Cashbox {
    private double cash;

    public Cashbox(double cash){
        this.cash = cash;
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

package com.company.entities;
import java.util.ArrayList;

public final class Client extends Human{
    private ArrayList<Dessert> order;
    private int masterClassDuration;
    public Client(String name, String surname, int masterClassDur) {
        super(name, surname);
        this.masterClassDuration = masterClassDur;
        this.order = new ArrayList<>();
    }

    public void addOrder(Dessert newOrder){
        order.add(newOrder);
    }

    public ArrayList<Dessert> getOrder(){
        return this.order;
    }

    public int getMasterClassDuration(){
        return masterClassDuration;
    }
}

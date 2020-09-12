package com.company.entities;
import java.util.ArrayList;

public final class Client extends Human{

    private final ArrayList<Dessert> order = new ArrayList<>();
    private final MasterClass masterClass;

    public Client(String name, String surname, MasterClass masterClass) {
        super(name, surname);
        this.masterClass = masterClass;
    }

    public void addOrder(Dessert newOrder){
        order.add(newOrder);
    }

    public ArrayList<Dessert> getOrder(){
        return this.order;
    }

    public MasterClass getMasterClass(){
        return masterClass;
    }
}

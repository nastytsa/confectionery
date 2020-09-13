package com.company.entities;
import com.company.staff.Human;

import java.util.ArrayList;

public final class Client extends Human {

    private final ArrayList<Dessert> order;
    private final MasterClass masterClass;

    public Client(String name, String surname, ArrayList<Dessert> order, MasterClass masterClass) {
        super(name, surname);
        this.masterClass = masterClass;
        this.order = order;
    }

    public ArrayList<Dessert> getOrder(){
        return this.order;
    }

    public MasterClass getMasterClass(){
        return masterClass;
    }
}

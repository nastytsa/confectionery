package com.company.entities;

public class Cook extends Human{

    public Cook(String name, String surname, Staff staff){
        super(name, surname);
        staff.addCook();
    }

    public String speak(){
        return "- Hello, my name is " + name + surname + " and today I will show your some magic.\n";
    }
}

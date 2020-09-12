package com.company.entities;

public class Cook extends Human{
    public Cook(String name, String surname){
        super(name, surname);
    }

    public void speak(){
        System.out.println("- Hello, my name is " + name + surname + " and today I will show your some magic.\n");
    }
}

package com.company.entities;

public class Salesman extends Human{

    public Salesman(String name, String surname){
        super(name, surname);
    }

    public void speak(){
        System.out.println("- Welcome to our shop. My name is " + name + surname);
    }
}

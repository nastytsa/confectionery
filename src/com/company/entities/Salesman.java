package com.company.entities;

public class Salesman extends Human{

    public Salesman(String name, String surname){
        super(name, surname);
    }

    public void greeting(){
        System.out.println("- Welcome to our shop. My name is " + name + surname + ". Can I help you?\n");
    }

    public void waiting(){
        System.out.println("- Please wait. Your order is being prepared.\n");
    }

    public void goodbye(){
        System.out.println("- Have a nice day!\n");
    }
}

package com.company.staff;

public class Salesman extends Human {

    public Salesman(String name, String surname, Staff staff){
        super(name, surname);
        staff.addSalesman();
    }

    public String greeting(){
        return "- Welcome to our shop. My name is " + name + " " + surname + ". Can I help you?";
    }

    public String waiting(){
        return "- Please wait. Your order is being prepared.\n";
    }

    public String goodbye(){
        return"- Have a nice day!\n";
    }
}

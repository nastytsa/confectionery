package com.company.entities;

public class Accountant extends Human{

    public Accountant(String name, String surname, Staff staff){
        super(name, surname);
        staff.addAccountant();
    }

    public String showReport(){
       return "\n-Here's report for this month\n";
    }
}

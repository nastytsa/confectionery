package com.company.staff;

public class Accountant extends Human {

    public Accountant(String name, String surname, Staff staff){
        super(name, surname);
        staff.addAccountant();
    }

    public String showMonthReport(Administrator admin){
       return "\n- " + admin.getName() + " " + admin.getSurname() + ", here's report for this month";
    }
}

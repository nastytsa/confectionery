package com.company.entities;

public class Administrator extends Human{

    public Administrator(String name, String surname, Staff staff){
        super(name, surname);
        staff.addAdmin();
    }

    public String requestReport(Accountant accountant){
        return "\n-" + accountant.getName() + accountant.getSurname() + ", show me the report, please.\n";
    }
}

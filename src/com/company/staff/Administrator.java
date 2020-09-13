package com.company.staff;

public class Administrator extends Human {

    public Administrator(String name, String surname, Staff staff){
        super(name, surname);
        staff.addAdmin();
    }

    public String requestMonthReport(Accountant accountant){
        return "\n-" + accountant.getName() + accountant.getSurname() + ", show me the report for this month, please.";
    }
}

package com.company.staff;

public class Cook extends Human {

    public Cook(String name, String surname, Staff staff){
        super(name, surname);
        staff.addCook();
    }

    public String speak(){
        return "- Hello, my name is " + name + " " + surname
                +" . You ordered a master class, so today I will show your some magic.\n";
    }
}

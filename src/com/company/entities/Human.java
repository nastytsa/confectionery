package com.company.entities;

public class Human {

    protected String name;
    protected String surname;

    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }
}

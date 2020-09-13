package com.company.staff;

public class Staff {

    private int cooks;
    private int salesmen;
    private int accountants;
    private int administrators;

    public Staff(){
        cooks = salesmen = accountants = administrators = 0;
    }

    public void addCook(){
        cooks++;
    }

    public void addSalesman(){
        salesmen++;
    }

    public void addAccountant(){
        accountants++;
    }

    public void addAdmin(){
        administrators++;
    }

    public int getCooks(){
        return cooks;
    }

    public int getAccountants() {
        return accountants;
    }

    public int getSalesmen() {
        return salesmen;
    }

    public int getAdministrators() {
        return administrators;
    }
}

package com.company.services;
import com.company.entities.*;

public class FinancialService {

    private double income;
    private Cashbox cashbox;

    public FinancialService(){
        cashbox = new Cashbox();
        income = 0.0;
    }

    public double countStaffExpense(Staff staff){
        return (staff.getAccountants() * 300) + (staff.getAdministrators() * 350) //wages per day
                + (staff.getCooks() * 300) + (staff.getSalesmen() * 250);
    }

    public double countStockExpense(Stock stock){
        return (stock.numberOfDessert(dessertName.NAPOLEON) * 150)  //expired desserts
               + (stock.numberOfDessert(dessertName.TIRAMISU) * 100)
                + (stock.numberOfDessert(dessertName.CHEESECAKE) * 80);
    }

    public void countIncome(Staff staff, Stock stock){
        double expense = countStaffExpense(staff) + countStockExpense(stock);
        income = cashbox.getCash() - expense;
    }

    public double getIncome() {
        return income;
    }

    public void payForBill(Bill bill){
        cashbox.addCash(bill.getOrderPrice());
    }

    public void closeConfectionery(){
        cashbox.resetCash();
    }
}

package com.company;

import com.company.entities.*;
import com.company.services.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	FinancialService financialService = new FinancialService();
	ReportService reportService = new ReportService("September");

	Stock stock = new Stock();
    Dessert napoleon = new Dessert(dessertName.NAPOLEON, 150, stock);
    Dessert cheesecake = new Dessert(dessertName.CHEESECAKE, 80, stock);

    MasterClass masterClass = new MasterClass(60)
    Client client = new Client("Jonathan", "Joestar", masterClass);


    reportService.addDailyIncome( financialService.getIncome() );
    System.out.println(reportService.createDailyReport( financialService.getIncome()));
    financialService.closeConfectionery();
    stock.cleanStock();
    }

    public ArrayList<Dessert> createOrder(Client client, int numNapoleon, int numCheesecake, int numTiramisu){
        Stock forOrder = new Stock();
        ArrayList<Dessert> order = new ArrayList<>(numCheesecake + numNapoleon + numTiramisu);

        for(int i = 0; i < numCheesecake; i++) {
            order.get(i) = new Dessert(dessertName.CHEESECAKE, 80, forOrder);
        }

        for(int i = 0; i < numTiramisu; i++)
            order.get(i) = new Dessert(dessertName.TIRAMISU, 100, forOrder);

        for(int i = 0; i < numNapoleon; i++) {
            order.get(i) = new Dessert(dessertName.NAPOLEON, 150, forOrder);
        }
        return order;
    }
}

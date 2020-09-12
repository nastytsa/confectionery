package com.company.entities;
import java.util.HashMap;

public class Stock {

    private HashMap<dessertName, Integer> stock = new HashMap<>();

    public Stock(int napoleonNum, int cheesecakeNum, int tiramisuNum){
        stock.put(dessertName.NAPOLEON, napoleonNum);
        stock.put(dessertName.CHEESECAKE, cheesecakeNum);
        stock.put(dessertName.TIRAMISU, tiramisuNum);
    }

    public void addDessert(dessertName newDessert){
        int number = stock.get(newDessert);
        stock.put(newDessert, number + 1);
    }

    public void removeDessert(dessertName dessert){
        if(stock.get(dessert) > 0){
            int number = stock.get(dessert);
            stock.put(dessert, number - 1);
        }
    }

    public boolean checkDessert(dessertName dessert){
        return stock.get(dessert) > 0;
    }
}

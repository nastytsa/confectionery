package com.company.entities;
import java.util.HashMap;

public class Stock {

    private HashMap<dessertName, Integer> stock;

    public Stock(){
        stock = new HashMap<>();
        stock.put(dessertName.NAPOLEON, 0);
        stock.put(dessertName.CHEESECAKE, 0);
        stock.put(dessertName.TIRAMISU, 0);
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

    public int numberOfDessert(dessertName dessert){
        return stock.get(dessert);
    }

    public void cleanStock(){
        stock.put(dessertName.NAPOLEON, 0);
        stock.put(dessertName.CHEESECAKE, 0);
        stock.put(dessertName.TIRAMISU, 0);
    }
}

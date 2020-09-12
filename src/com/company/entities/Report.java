package com.company.entities;
import java.util.Date;

public class Report {

    private Date date;
    private Double totalIncome;
    private int napoleonQuantity;
    private int cheesecakeQuantity;
    private int tiramisuQuantity;

    public Report(){
        this.date = new Date();
    }
}

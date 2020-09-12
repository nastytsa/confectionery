package com.company.services;
import java.util.Date;
import com.company.services.FinansialService;

public class ReportService {
    private Double totalIncome;
    private int napoleonQuantity;
    private int cheesecakeQuantity;
    private int tiramisuQuantity;
    private int masterClassDuration;

    public ReportService(){
        totalIncome = 0.0;
        cheesecakeQuantity = napoleonQuantity = tiramisuQuantity = 0;
    }

    public void addCheesecake(){
        this.cheesecakeQuantity++;
    }

    public void addTiramisu(){
        this.tiramisuQuantity++;
    }

    public void addNapoleon() {
        this.napoleonQuantity++;
    }

    public void addMasterclass(int duration){
        masterClassDuration += duration;
    }
}

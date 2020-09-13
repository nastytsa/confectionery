package com.company.services;
import java.util.Date;

public class ReportService {

    private final String month;
    private Double totalIncome;
    private int napoleonQuantity;
    private int cheesecakeQuantity;
    private int tiramisuQuantity;
    private int masterClassDuration;

    public ReportService(String month){
        this.month = month;
        totalIncome = 0.0;
        cheesecakeQuantity = napoleonQuantity = tiramisuQuantity = masterClassDuration = 0;
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

    public void addDailyIncome(double dailyIncome){
        totalIncome += dailyIncome;
    }

    public String createDailyReport(double income){
        Date date = new Date();
        StringBuilder report = new StringBuilder();
        report.append("\n**************************************************\nIncome for ")
                .append(date.toString())
                .append(" : \t").append(income)
                .append("\n**************************************************\n");
        return report.toString();
    }

    public String createMonthlyReport(){
        StringBuilder report = new StringBuilder();
        report.append("\n___________________________________________\nReport for " + month + " :\n")
                .append("\nAmount of Napoleon sold: ").append(napoleonQuantity)
                .append("\nAmount of Cheesecakes sold: ").append(cheesecakeQuantity)
                .append("\nAmount of Tiramisu sold: ").append(tiramisuQuantity)
                .append("\nTotal duration of master classes: ").append(masterClassDuration)
                .append("\n\n___________________________________________\nTotal income: ").append(totalIncome)
                .append("\n___________________________________________\n");
        return report.toString();
    }
}

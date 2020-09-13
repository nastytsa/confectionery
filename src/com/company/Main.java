package com.company;

import com.company.entities.*;
import com.company.services.*;
import com.company.staff.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

	FinancialService financialService = new FinancialService();
	ReportService reportService = new ReportService("September");

	Stock stock = new Stock();
    Dessert napoleon = new Dessert(dessertName.NAPOLEON, 150, stock);
    Dessert cheesecake = new Dessert(dessertName.CHEESECAKE, 80, stock);

    Staff staff = new Staff();
    Administrator admin = new Administrator("Dio", "Brando", staff);
    Accountant accountant = new Accountant("Harry", "Jameson", staff);
    Cook cook = new Cook("Captain", "Cook", staff);
    Salesman salesman = new Salesman("Jotaro", "Kujo", staff);

    confectioneryInfo(accountant, admin, cook, salesman);

    Client client = createClient("Jonathan", "Joestar",
            10, 2, 0, 60);
    serveOrder(client, salesman, cook, stock, reportService, financialService);


    closeConfectionery(reportService, financialService, stock, staff, admin, accountant);
    getMonthReport(admin, accountant, reportService);
    }

    public static void closeConfectionery(ReportService repServ, FinancialService finServ, Stock stock,
                                          Staff staff, Administrator admin, Accountant accountant){
        System.out.println("Confectionery is closed.\n");
        finServ.countIncome(staff, stock);
        repServ.addDailyIncome( finServ.getIncome() );
        System.out.println(repServ.createDailyReport( finServ.getIncome()));
        finServ.closeConfectionery();
        stock.cleanStock();
    }

    public static Client createClient(String name, String surname,
                                      int numNapoleon, int numCheesecake, int numTiramisu, int masterClassDuration){
        ArrayList <Dessert> order = createOrder(numNapoleon, numCheesecake, numTiramisu);
        MasterClass masterClass = new MasterClass(masterClassDuration);
        return new Client(name, surname, order, masterClass);
    }

    public static void serveOrder(Client client, Salesman salesman, Cook cook, Stock stock,
                                  ReportService reportService, FinancialService finServ){
        OrderService orderService = new OrderService(client, salesman, cook, reportService);
        orderService.serveDessert(stock);
        System.out.println(salesman.greeting());
        finServ.payForBill(orderService.getBill());
        System.out.println(orderService.info());
        System.out.println(salesman.waiting());
        System.out.println(orderService.checkMasterClass(reportService));
        System.out.println(salesman.goodbye());
    }

    public static void confectioneryInfo(Accountant accountant, Administrator admin, Cook cook, Salesman salesman){
        StringBuilder info = new StringBuilder();
        info.append("\n\nThis small confectionery serves desserts: napoleon (150), cheesecake(80) and tiramisu(100)")
                .append("\nThere is also an opportunity to order a master class (5 per minute).\n")
                .append("\nWorkers:\n\tAdministrator: ").append(admin.getName() + " ").append(admin.getSurname())
                .append("\n\tAccountant: ").append(accountant.getName() + " ").append(accountant.getSurname())
                .append("\n\tSalesman: ").append(salesman.getName() + " ").append(salesman.getSurname())
                .append("\n\tCook: ").append(cook.getName() + " ").append(cook.getSurname())
                .append("\nHere is the first customer.\n");
        System.out.println(info.toString());
    }

    public static ArrayList<Dessert> createOrder(int numNapoleon, int numCheesecake, int numTiramisu){
        ArrayList<Dessert> order = new ArrayList<>(numCheesecake + numNapoleon + numTiramisu);

        for(int i = 0; i < numCheesecake; i++) {
            order.add(new Dessert(dessertName.CHEESECAKE, 80));
        }

        for(int i = 0; i < numTiramisu; i++)
            order.add(new Dessert(dessertName.TIRAMISU, 100));

        for(int i = 0; i < numNapoleon; i++) {
            order.add(new Dessert(dessertName.NAPOLEON, 150));
        }
        return order;
    }

    static void getMonthReport(Administrator admin, Accountant accountant, ReportService reportService){
        System.out.println(admin.requestMonthReport(accountant));
        System.out.println(accountant.showMonthReport(admin));
        System.out.println(reportService.createMonthlyReport());
    }
}

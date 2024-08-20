package org.example;
public class Main {
    public static void main(String[] args) {

        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.getAccountDetails("777121");
        bankingFacade.transfer("777121","232432",500.0);
        bankingFacade.pay("777121","SEYMURAHMADZADA345",50.5);

    }
}
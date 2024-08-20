package org.example;

public class BillPaymentService {
    public void pay(String accountId, String billId, double amount){
        System.out.println("Pay for" + billId + " from account" + accountId + " to sum" + amount);
    }
}

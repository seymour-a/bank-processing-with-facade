package org.example;

public class BankingFacade {
    private AccountService accountService;
    private BillPaymentService billPaymentService;
    private TransferService transferService;

    public BankingFacade(){
        this.accountService = new AccountService();
        this.billPaymentService = new BillPaymentService();
        this.transferService = new TransferService();
    }
    public void getAccountDetails(String accountId){
        accountService.getAccountDetails(accountId);
    }
    public void pay(String accountId, String billId, double amount){
        billPaymentService.pay(accountId, billId,amount);
    }
    public void transfer(String fromAccount,String toAccount, double amount){
        transferService.transfer(fromAccount, toAccount, amount);
    }
}

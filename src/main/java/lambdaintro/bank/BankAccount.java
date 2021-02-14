package lambdaintro.bank;

import exections.Bank;

public class BankAccount {

    private String accountNumber;
    private String nameOfOwner;
    private double balance;

    public BankAccount(String accountNumber, String nameOfOwner, double balance) {
        this.accountNumber = accountNumber;
        this.nameOfOwner = nameOfOwner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber + ", " + "NameOfOwner: " + nameOfOwner + ", " + "Balance: "+ balance + "\n";
    }
}

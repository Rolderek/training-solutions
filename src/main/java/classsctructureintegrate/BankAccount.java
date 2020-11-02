package classsctructureintegrate;

public class BankAccount {

    private String owner;
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = owner;
        this.owner = accountNumber;
        this.balance = balance;
    }

    public void deposit(int betet) {
        balance = balance + betet;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getInfo() {
        return owner + " (" + accountNumber + ") " +balance;
    }





}

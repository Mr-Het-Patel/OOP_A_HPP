package model;

public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

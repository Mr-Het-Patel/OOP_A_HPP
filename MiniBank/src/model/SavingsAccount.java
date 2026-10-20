package model;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override public void deposit(double amount) { balance += amount; }
    @Override public void withdraw(double amount) { balance -= amount; }
}

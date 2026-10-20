package model;

public class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override public void deposit(double amount) { balance += amount; }
    @Override public void withdraw(double amount) { balance -= amount; }
}

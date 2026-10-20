package model;

public class FixedDepositAccount extends Account {
    public FixedDepositAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override public void deposit(double amount) { balance += amount; }
    @Override public void withdraw(double amount) { balance -= amount; }
}

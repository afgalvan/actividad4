package edu.unicesar.taller.cuarto.points.account;

public class Account {
    private int number;
    private String clientName;
    private double balance;
    private double lastTransaction;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLastTransaction() {
        return lastTransaction;
    }

    public boolean deposit(double amount) {
        lastTransaction = amount;
        if (amount < 1) {
            return  false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        lastTransaction = amount;
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}

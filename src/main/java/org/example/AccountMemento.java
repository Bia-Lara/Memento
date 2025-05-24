package org.example;

public class AccountMemento implements IMemento {
    private final double balance;
    private final boolean active;

    public AccountMemento(double balance, boolean active) {
        this.balance = balance;
        this.active = active;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean getActive() {
        return active;
    }
}

package org.example;

public class BankAccount implements IBankAccount {
    public double balance;
    public boolean active;

    public BankAccount() {
        active = true;
    }

    public void pay(double ammount) {
        this.balance -= ammount;
    }

    public void receivePayment(double ammount) {
        this.balance += ammount;
    }

    public void deactivateAccount() {
        this.active = false;
    }

    public void activateAccount() {
        this.active = true;
    }

    public IMemento saveState() {
        return new AccountMemento(balance, active);
    }

    public void backState(IMemento memento) {
        this.balance = memento.getBalance();
        this.active = memento.getActive();
    }

    @Override
    public String toString() {
        return String.format("Balance: %f | Active: %b", balance, active);
    }
}


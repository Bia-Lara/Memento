package org.example.domain.entities;

import org.example.domain.interfaces.IMemento;
import org.example.domain.value_objects.MementoAccount;

import java.math.BigDecimal;
import java.util.UUID;

public class BankAccount {
    private UUID id;
    private BigDecimal balance;

    public BankAccount(BigDecimal balance) {
        this.id = UUID.randomUUID();
        this.balance = balance;
    }

    public void deposit(BigDecimal amount){balance = balance.add(amount);}

    public boolean withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            return true;
        }
        return false;
    }

    public IMemento createMemento() {return new MementoAccount(balance);}

    public void restore(IMemento memento) {this.balance = memento.getBalance();}

    public UUID getId() {return id;}

    public BigDecimal getBalance() {return balance;}
}

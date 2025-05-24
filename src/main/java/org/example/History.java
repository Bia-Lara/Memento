package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class History {
    private final Stack<IMemento> history;

    public History(BankAccount account) {
        this.history = new Stack<IMemento>();
        history.push(account.saveState());
    }

    public void save(BankAccount account) {
        history.push(account.saveState());
    }

    public void undoTransference(BankAccount account) {
        if(history.isEmpty()) System.out.println("não há estado anterior");
        else{
            IMemento previousState = history.pop();
            account.returnState(previousState.getBalance(), previousState.getActive());
        }
    }
}


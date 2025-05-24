package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class History {
    private final Stack<IMemento> history;

    public History(IBankAccount account) {
        this.history = new Stack<IMemento>();
        history.push(account.saveState());
    }

    public void save(IBankAccount account) {
        history.push(account.saveState());
    }

    public void undoTransference(IBankAccount account) {
        if(history.size() <= 1) System.out.println("não há estado anterior");
        else{
            IMemento previousState = history.pop();
            account.backState(previousState);
        }
    }
}


package org.example;

public interface IBankAccount {
    IMemento saveState();
    void backState(IMemento memento);
}

package org.example.domain.value_objects;

import org.example.domain.interfaces.IMemento;

import java.math.BigDecimal;

public class MementoAccount implements IMemento {

    private final BigDecimal savedBalance;


    public MementoAccount(BigDecimal savedBalance) {
        this.savedBalance = savedBalance;
    }

    @Override
    public BigDecimal getBalance(){
        return savedBalance;
    }
}

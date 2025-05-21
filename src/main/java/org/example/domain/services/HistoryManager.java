package org.example.domain.services;

import org.example.domain.interfaces.IMemento;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class HistoryManager {
    private Map<UUID, IMemento> history = new HashMap<>();

    public void save(UUID id, IMemento memento){history.put(id,memento);}

    public IMemento restore(UUID id){
        return history.get(id);
    }
}

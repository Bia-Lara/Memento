package org.example.domain.entities;

import org.example.domain.value_objects.Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private UUID id;
    private UUID accountId;
    private LocalDateTime timestamp;
    private Status status;
    private BigDecimal value;

    public Transaction(UUID accountId, LocalDateTime timestamp, Status status, BigDecimal value) {
        this.id = UUID.randomUUID();
        this.accountId = accountId;
        this.timestamp = timestamp;
        this.status = status;
        this.value = value;
    }

    public UUID getId() {return id;}

    public UUID getAccountId() {return accountId;}

    public LocalDateTime getTimestamp() {return timestamp;}

    public Status getStatus() {return status;}

    public BigDecimal getValue() {return value;}

    public void setStatus(Status status) {this.status = status;}
}

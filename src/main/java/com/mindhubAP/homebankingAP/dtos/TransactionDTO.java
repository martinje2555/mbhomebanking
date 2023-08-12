package com.mindhubAP.homebankingAP.dtos;

import com.mindhubAP.homebankingAP.models.Transaction;
import com.mindhubAP.homebankingAP.models.TransactionType;

import java.time.LocalDate;

public class TransactionDTO {

    private long id;

    private TransactionType type;
    private double amount;
    private LocalDate localDate;
    private String description;

    public TransactionDTO(){}

    public TransactionDTO(Transaction transaction) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.localDate = localDate;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public String getDescription() {
        return description;
    }
}

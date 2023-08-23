package com.mindhubAP.homebankingAP.dtos;

import com.mindhubAP.homebankingAP.models.Transaction;
import com.mindhubAP.homebankingAP.models.TransactionType;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TransactionDTO {

    private long id;

    private TransactionType type;
    private double amount;
    private LocalDate localDate;
    private String description;

    public TransactionDTO(){}

    public TransactionDTO(Transaction transaction) {
        this.id = transaction.getId();
        this.type = transaction.getType();
        this.amount = transaction.getAmount();
        this.localDate = transaction.getLocalDate();
        this.description = transaction.getDescription();
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

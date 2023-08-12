package com.mindhubAP.homebankingAP.dtos;

import com.mindhubAP.homebankingAP.models.Account;

import java.time.LocalDate;

public class AccountDTO {

    private long id;
    private String number;
    private LocalDate creationDate;
    private double balance;

    public AccountDTO(){}

    public AccountDTO(Account account){
        this.id = account.getId();
        this.number = account.getNumber();
        this.creationDate = account.getCreationDate();
        this.balance = account.getBalance();
    }

    public long getId() { return id; }

    public String getNumber() {
        return number;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public double getBalance() {
        return balance;
    }


}

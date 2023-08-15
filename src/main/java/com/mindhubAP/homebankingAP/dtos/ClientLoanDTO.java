package com.mindhubAP.homebankingAP.dtos;

import com.mindhubAP.homebankingAP.models.ClientLoan;

public class ClientLoanDTO {

    private long id;
    private String name;
    private long amount;
    private int payment;

    private long loanId;

    public ClientLoanDTO() {}

    public ClientLoanDTO(ClientLoan clientLoan) {
        this.id = clientLoan.getId();
        this.name = clientLoan.getLoan().getName();
        this.amount = clientLoan.getAmount();
        this.payment = clientLoan.getPayment();

        this.loanId = clientLoan.getLoan().getId();

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getAmount() {
        return amount;
    }

    public int getPayment() {
        return payment;
    }



    public long getLoanId() {
        return loanId;
    }
}

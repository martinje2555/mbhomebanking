package com.mindhubAP.homebankingAP.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class ClientLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;


    private long amount;
    private int payment;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clientId")
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "loanId")
    private Loan loan;

    public ClientLoan() {
    }



    public ClientLoan(long amount, int payment) {

        this.amount = amount;
        this.payment = payment;

    }

    public long getId() {
        return id;
    }






    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }



    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }


    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }
}

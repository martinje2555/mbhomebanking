package com.mindhubAP.homebankingAP.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private String id;

    private String number;
    private LocalDate creationDate;
    private double balance;

    @ManyToOne(fetch = fetchType.EAGER);
    @JoinColumn(name = "owner_id");
    private Client owner;

    public Account(){}

    public Account(String number, LocalDate creationDate, double balance){}


    public String getNumber() {
        //String number = number;
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }








}

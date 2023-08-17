package com.mindhubAP.homebankingAP.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private CardType type;
    private String number;
    private short securityCode;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;
    private String clientName;
    private Colour colour;

    public Card() {
    }

    public Card(CardType type, String number, short securityCode, LocalDate effectiveDate, LocalDate expirationDate, String clientName, Colour colour) {
        this.type = type;
        this.number = number;
        this.securityCode = securityCode;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
        this.clientName = clientName;
        this.colour = colour;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clientId")
    private Client client;

    public long getId() {
        return id;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public short getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(short securityCode) {
        this.securityCode = securityCode;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }
}

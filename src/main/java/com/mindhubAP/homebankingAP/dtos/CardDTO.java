package com.mindhubAP.homebankingAP.dtos;

import com.mindhubAP.homebankingAP.models.CardType;
import com.mindhubAP.homebankingAP.models.Colour;

import java.time.LocalDate;

public class CardDTO {

    private long id;
    private CardType type;
    private String number;
    private short securityCode;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;
    private String clientName;
    private Colour colour;

    public CardDTO() {
    }

    public CardDTO(CardType type, String number, short securityCode, LocalDate effectiveDate, LocalDate expirationDate, String clientName, Colour colour) {
        this.type = type;
        this.number = number;
        this.securityCode = securityCode;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
        this.clientName = clientName;
        this.colour = colour;
    }

    public long getId() {
        return id;
    }

    public CardType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public short getSecurityCode() {
        return securityCode;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getClientName() {
        return clientName;
    }

    public Colour getColour() {
        return colour;
    }
}

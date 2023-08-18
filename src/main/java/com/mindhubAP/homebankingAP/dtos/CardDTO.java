package com.mindhubAP.homebankingAP.dtos;

import com.mindhubAP.homebankingAP.models.Card;
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

    public CardDTO(Card card) {
        this.id = card.getId();
        this.type = card.getType();
        this.number = card.getNumber();
        this.securityCode = card.getSecurityCode();
        this.effectiveDate = card.getEffectiveDate();
        this.expirationDate = card.getExpirationDate();
        this.clientName = card.getClientName();
        this.colour = card.getColour();
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

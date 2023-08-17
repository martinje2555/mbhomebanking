package com.mindhubAP.homebankingAP.dtos;

import com.mindhubAP.homebankingAP.models.Account;
import com.mindhubAP.homebankingAP.models.Client;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;


public class ClientDTO {

    private long id;
    private String firstName;
    private String lastName;
    private String eMail;
    private Set<AccountDTO> accounts;
    private Set<ClientLoanDTO> clientLoan;
    private Set<CardDTO> card;

    public ClientDTO(){}

    public ClientDTO(Client client){
        this.id = client.getId();
        this.firstName = client.getFirstName();
        this.lastName = client.getLastName();
        this.eMail = client.getEMail();
        this.accounts = client.getAccounts().stream().map(account -> new AccountDTO(account)).collect(Collectors.toSet());
        this.clientLoan = client.getClientLoans().stream().map(clientLoan -> new ClientLoanDTO(clientLoan)).collect(Collectors.toSet());
        this.card = client.getCards().stream().map(client -> new CardDTO(card)).collect(Collectors.toSet());
    }

    public long getId() {
        return id;
    }

    public String getFirstName (){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEMail(){return eMail;}

    public void setEMail(String eMail){
        this.eMail = eMail;
    }

    public String toString(){
        return firstName + " " + lastName;
    }
    public Set<AccountDTO> getAccounts() { return accounts; }

    public Set<ClientLoanDTO> getClientLoan(){return clientLoan; }

    public Set<CardDTO> getCards(){return card; }


}
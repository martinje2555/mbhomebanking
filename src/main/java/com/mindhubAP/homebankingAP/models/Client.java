package com.mindhubAP.homebankingAP.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

@Entity

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String firstName;
    private String lastName;
    private String eMail;


    public Client(){}

    public Client(String first, String last, String eMail){
        this.firstName = first;
        this.lastName = last;
        this.eMail = eMail;
    }

    @OneToMany(mappedBy="owner", fetch = FetchType.EAGER)
    private Set<Account> accounts = new HashSet<>();

    public void addAccount (Account account) {
        account.setOwner(this);
        accounts.add(account);
    }

    @OneToMany(mappedBy="client", fetch = FetchType.EAGER)
    private Set<ClientLoan> clientLoans = new HashSet<>();

    public void addClientLoan (ClientLoan clientLoan) {
        clientLoan.setClient(this);
        clientLoans.add(clientLoan);
    }

    @OneToMany(mappedBy="client", fetch = FetchType.EAGER)
    private Set<Card> cards = new HashSet<>();

    public void addCard (Card card) {
        card.setClient(this);
        cards.add(card);
    }



    public long getId() {
        return id;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public Set<ClientLoan> getClientLoans() { return clientLoans;}

    public Set<Card> getCards() {return cards;}

    public String getFirstName (){
            return firstName;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }


        public String getEMail(){return eMail;}

        public void setEMail(String eMail){
            this.eMail = eMail;
        }
        public String toString(){
        return firstName + " " + lastName;
    }


}

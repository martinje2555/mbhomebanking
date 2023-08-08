package com.mindhubAP.homebankingAP.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
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

    @OneToMany(mappedBy="owner", fetch = FetchType.EAGER)
    Set<Account> accounts = new HashSet<>();


    public Client(){}

    public Client(String first, String last, String eMail){
        this.firstName = first;
        this.lastName = last;
        this.eMail = eMail;
    }

    public void addAccount (Account account) {
        account.setOwner(this);
        accounts.add(account);
    }

    public long getId() {
        return id;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

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

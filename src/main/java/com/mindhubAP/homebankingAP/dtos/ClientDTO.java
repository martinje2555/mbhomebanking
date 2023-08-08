package com.mindhubAP.homebankingAP.dtos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;


public class ClientDTO {

    private long id;
    private String firstName;
    private String lastName;
    private String eMail;

    public ClientDTO(){}

    public ClientDTO(Client client){
        this.id = client.getId();
        this.firstName = client.getFirstName();
        this.lastName = client.getLastName();
        this.eMail = client.getEMail();
    }

    public long getId() {
        return id;
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

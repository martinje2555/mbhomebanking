package com.mindhubAP.homebankingAP.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;
    private String firstName;
    private String lastName;
    private String eMailAdress;

    public Client(){}

    public Client(String first, String last, String eMail){
        this.firstName = first;
        this.lastName = last;
        this.eMailAdress = eMail;
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


        public String geteMailAdress(){
            return eMailAdress;
        }

        public void seteMailAdress(String eMailAdress){
            this.eMailAdress = eMailAdress
        }
    public String toString(){
        return firstName + " " + lastName;
    }

}

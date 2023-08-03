package com.mindhubAP.homebankingAP.models;


import javax.persistence.Entity;

@Entity

public class Client {

    public String firstName;
    public String lastName;
    public String eMailAdress;

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

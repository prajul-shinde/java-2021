package com.timbuchalka.challenge;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    //first two constructors calling the third constructor
    //only this constructor is initializing the values
    public VipPerson() {
        this("default name", 5000.90, "defaultemail@gmail.com");

    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

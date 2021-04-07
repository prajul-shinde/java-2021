package com.timbuchalka;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        // calling constructor which is given below with default values
        this("56789",2.50,"default name","default address","default phone number");
        System.out.println("empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        System.out.println("account constructor with parameters is called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("9999",100.25,customerName,customerEmailAddress,customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("deposit of "+depositAmount+" successful! new balance is "+this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance-withdrawalAmount<0) {
            System.out.println("only "+balance +" amount available. withdrawal failed due to insufficient balance!");
        }
        else {
            this.balance-=withdrawalAmount;
            System.out.println("withdrawal of "+withdrawalAmount+" successful, available balance is "+this.balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

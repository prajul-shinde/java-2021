package com.timbuchalka;

public class Main {

    public static double calculateInterest(double amount,double interestRate){
        return(amount*(interestRate/100));
    }

    public static void main(String[] args) {
        for(int i=2;i<9;i++){
            System.out.println("10,000 at "+i+"% interest is "+String.format("%.2f",calculateInterest(10_000d,i)));
        }
    }
}

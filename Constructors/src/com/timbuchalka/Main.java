package com.timbuchalka;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
       Account bobsAccount = new Account(); //"12345", 0.00, "Bob Brown", "myemail@bob.com", "(087)123-456");

       bobsAccount.withdrawal(100.0d);
       bobsAccount.deposit(50.0d);
       bobsAccount.deposit(51.0d);
        bobsAccount.withdrawal(100.0d);

        Account timsAccount=new Account("tim","tim@email.com","12345");
        System.out.println(timsAccount.getNumber()+" name "+timsAccount.getCustomerName());
        System.out.println("current balance is "+timsAccount.getBalance());
        timsAccount.withdrawal(100.25);



    }

}


package com.timbuchalka.practice;

public class CustomerTest {
    public static void main(String[] args) {

    Customer c1=new Customer();
        System.out.println(c1.getName());
        Customer c2=new Customer(2,"bob");
        System.out.println(c2.getName());
        Customer c3=new Customer(3,"tim",3000);
        System.out.println(c3.getName());
    }

}

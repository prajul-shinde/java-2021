package com.timbuchalka.challenge;

public class Test {
    public static void main(String[] args) {
        VipPerson person1=new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2=new VipPerson("bob",25000.00);
        System.out.println(person2.getName());

        VipPerson person3=new VipPerson("tim",5_0.000,"tim@gmail.com");
        System.out.println(person3.getName());
    }
}

package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString ="this is a String";
        System.out.println("myString is "+myString);
        myString=myString+", and this is more.";
        System.out.println("myString is now became "+myString);
        myString=myString+" \u00A9 2021";
        System.out.println("myString is now "+myString);

        String numberString="250.55";
        numberString=numberString+"49.95";
        System.out.println("numberString is "+numberString);

        String lastString="10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("lastString is "+lastString);
    }
}

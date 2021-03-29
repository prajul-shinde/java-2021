package com.timbuchalka;

public class Exercise {
    public static void main(String[] args) {
        byte b=10;
        short s=20;
        int i=50;

        long solution=50_000L+10L*(b+s+i);
        System.out.println("solution is "+solution);
    }
}

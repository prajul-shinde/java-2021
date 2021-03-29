package com.timbuchalka;

public class Exercise {
    public static void main(String[] args) {
        double firstDouble=20d;
        double secondDouble=80d;
        double myTotal=25*(firstDouble+secondDouble);
        System.out.println("myTotal= "+myTotal);
        double remainder= myTotal%40;
        System.out.println("remainder= "+remainder);
        if(remainder<=20)
            System.out.println("total was over the limit");

    }
}

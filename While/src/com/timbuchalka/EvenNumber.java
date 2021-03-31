package com.timbuchalka;

public class EvenNumber {
    public static boolean isEven(int number) {
        if ((number % 2 )== 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int number=4;
        int finishedNumber=20;
        int totalEvenNumbers=0;
        while(number<=finishedNumber){
            number++;
            if(!isEven(number)){
                continue;
            }
            totalEvenNumbers++;
            System.out.println("even number is "+number);
        }
        System.out.println("total even numbers found "+totalEvenNumbers);
    }
}

package com.timbuchalka;

public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= (long)Math.sqrt(number); i++) {
            System.out.println("looping "+i);
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count=0;
        for(int i=10;i<50;i++){
            if(isPrime(i)){
                count++;
                System.out.println("number "+i+" is a prime number!");
                if(count==3){
                    System.out.println("exiting for loop");
                    break;
                }
            }
        }
    }
}

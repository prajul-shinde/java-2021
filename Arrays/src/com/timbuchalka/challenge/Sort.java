package com.timbuchalka.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int []myIntegers=getIntegers(5);
        printArray(myIntegers);
       int descendingSort[]= sortIntegers(myIntegers);
       printArray(descendingSort);

    }

    private static int[] sortIntegers(int[] myIntegers) {
//        int descending[]=new int[myIntegers.length];
//        for(int i=0;i<myIntegers.length;i++){
//            descending[i]=myIntegers[i];
//        }
        int descending[]= Arrays.copyOf(myIntegers,myIntegers.length);
        boolean flag=true;
        int temp;
        while (flag){
            flag=false;
            for (int i=0;i<myIntegers.length-1;i++){
                if(descending[i]<myIntegers[i+1]){
                    temp=descending[i];
                    descending[i]=descending[i+1];
                    descending[i]=temp;
                    flag=true;
                }

            }
        }
        return descending;
    }

    private static void printArray(int[] myIntegers) {
        for(int i=0;i<myIntegers.length;i++){
            System.out.println("values at "+i+" location is "+myIntegers[i]);
        }
    }

    private static int[] getIntegers(int number) {
        int values[]=new int[number];
        System.out.println("enter "+number +" values: ");
        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
}

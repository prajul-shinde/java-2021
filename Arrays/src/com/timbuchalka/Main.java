package com.timbuchalka;

import java.util.Scanner;

public class Main {
private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int[]myIntArray=getValues(5);
        for(int i=0;i<myIntArray.length;i++){
            System.out.println("element "+i +", typed value was "+myIntArray[i]);
        }
        double average=calculateAverage(myIntArray);
        System.out.println("average is "+average);
    }

    private static double calculateAverage(int[] myIntArray) {
        int sum=0;
        for(int i=0;i<myIntArray.length;i++){
            sum=sum+myIntArray[i];
        }
        return (double) sum/(double)(myIntArray.length);
    }

    private static int[] getValues(int number) {
        System.out.println("Enter  "+number+" integer values \r");
        int values[]=new int[number];
        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
}

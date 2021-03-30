package com.timbuchalka;

public class Exercise {
    public static void main(String[] args) {
        char switchValue='F';
        switch (switchValue){
            case 'A':
                System.out.println("the value was A");
                break;
            case 'B':
                System.out.println("the value was B");
                break;
            case 'C':
                System.out.println("the value was C");
                break;
            case 'D': case 'E': case 'F':
                System.out.println("the value was D or E or F");
                break;
            default:
                System.out.println("the value was not  A or B or C or D or E or F");
                break;
        }
    }
}

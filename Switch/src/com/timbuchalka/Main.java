package com.timbuchalka;

public class Main {
// switch statement can be used with byte short char int and Strings
    public static void main(String[] args) {
        int switchValue=4;

        switch (switchValue){
            case 1:
                System.out.println("the value was 1");
                break;
            case 2:
                System.out.println("the value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("the value was a 3 or a 4 or a 5");
                System.out.println("actually it was a "+switchValue);
                break;
            default:
                System.out.println("value was not 1 or 2");
                break;
        }
    }
}

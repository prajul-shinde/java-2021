package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2= " + result);
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + "-1= " + result);
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + "*10= " + result);
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + "/5= " + result);
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + "%3= " + result);
        previousResult = result;
        result = result + 1;
        System.out.println("result is now " + result);
        result++;
        System.out.println("result is now " + result);
        result--;
        System.out.println("result is now " + result);
        result += 2;
        System.out.println("result is now " + result);
        result *= 10;
        System.out.println("result is now " + result);
        result -= 10;
        System.out.println("result is now " + result);
        result /= 10;
        System.out.println("result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("it is not an Alien!");
        int topScore = 80;
        if (topScore < 100)
            System.out.println("you got the high score!");
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("greater than second top score and less than 100");
        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("one of these tests is true!");

        boolean isCar=false;
        if(isCar=true)
            System.out.println("this is not supposed to happen!!");

        boolean wasCar=isCar ? true:false;
        if(wasCar)
            System.out.println("was car is true");

    }
}

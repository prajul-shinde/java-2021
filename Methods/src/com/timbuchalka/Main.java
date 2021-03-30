package com.timbuchalka;

public class Main {
    public static int calculateScore(boolean isGameOver,int score,int levelCompleted,int bonus){
        int finalScore=0;
        if(isGameOver){
             finalScore=score+(levelCompleted*bonus);
            System.out.println("your final score was "+finalScore);
            return finalScore;
        }
            return -1;
    }


    public static void main(String[] args) {
	// write your code here
        int finalScore = calculateScore(true, 800, 5, 100);
        System.out.println("your finalScore was "+finalScore);

        int secondFinalScore = calculateScore(true, 10000, 8, 200);
        System.out.println("your second final score was "+secondFinalScore);
    }
}

package com.timbuchalka;

public class Exercise {
    public static void main(String[] args) {
        boolean newGameOver=true;

        int score=10_000;
        int levelCompleted=8;
        int bonus=200;
        if(newGameOver){
            int finalScore=score+(levelCompleted*bonus);
            System.out.println("your final score was "+finalScore);
        }

    }
}

package com.timbuchalka;

public class Main {
    //just changing the return type doesn't change the signature so it's not overloading

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unknown player scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("no player name so no score");
        return 0;
    }

    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println("newScore " + newScore);
        calculateScore(75);
        calculateScore();
    }


}

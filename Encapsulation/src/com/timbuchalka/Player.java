package com.timbuchalka;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health<=0){
            System.out.println("player has been knocked out");
            // reduce number of lives remaining for player
        }

    }
    public int healthRemaining(){
        return this.health;
    }
}

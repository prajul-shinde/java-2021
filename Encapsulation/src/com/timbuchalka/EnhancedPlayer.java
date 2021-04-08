package com.timbuchalka;

public class EnhancedPlayer {
    private String name;
    private int health=100;
    private String weapon;
    
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0&& health<=100){
            this.health = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.health-=damage;
        if(this.health<=0){
            System.out.println("player has been knocked out");
            // reduce number of lives remaining for player
        }
    }
    public int remainingHealth(){
        return this.health;
    }
    public int getHealth() {
        return health;
    }
}

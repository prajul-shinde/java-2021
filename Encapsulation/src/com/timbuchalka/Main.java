package com.timbuchalka;
// Encapsulation= Mechanism that allows you to restrict access to certain components in the object that you are creating.
public class Main {

    public static void main(String[] args) {
//        Player player=new Player();
//        player.name="tim";
//        player.health=20;
//        player.weapon="sword";
//
//        int damage=10;
//        player.loseHealth(damage);
//        System.out.println("remaining Health "+player.healthRemaining());
//
//        damage=11;
//        player.loseHealth(damage);
//        System.out.println("remaining Health "+player.healthRemaining());

        EnhancedPlayer player=new EnhancedPlayer("tim",200,"sword");
        System.out.println("initial health is "+player.getHealth()); // 100 because validation
    }
}

package com.timbuchalka;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        System.out.println("inside dog constructor");
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    public void chew() {
        System.out.println("chew method of dog class");
    }

    @Override
    public void eat() {
        System.out.println("eat method of dog class");
        chew();
        super.eat();
    }
    public void walk() {
        System.out.println("dog walk method");
        super.move(5);
    }
    public void run() {
        System.out.println("dog run method");
        move(10);
    }
    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);
    }
    private void moveLegs(int speed) {
        System.out.println("dog.moveLegs was called and dog is moving his legs at speed of " + speed);
    }
}

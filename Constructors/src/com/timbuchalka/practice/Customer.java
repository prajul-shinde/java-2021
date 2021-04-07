package com.timbuchalka.practice;

public class Customer {
    private int id;
    private String name;
    private int salary;

    public Customer() {
        this(1,"default name",1000);
        System.out.println("this was default constructor");
    }

    public Customer(int id, String name) {
        this(2,"second default name",2000);
        System.out.println("constructor with id and salary as parameter was called");

    }

    public Customer(int id, String name, int salary) {
        System.out.println("all argument constructor was called");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

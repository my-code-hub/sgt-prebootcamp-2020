package com.accenture.prebootcamp.inheritance;

public class Employee {

    String name;
    public double salary;
    protected int age;

    String getDetails() {
        return "name - " + name + ", " +
                "salary - " + salary;
    }
}

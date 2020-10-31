package com.accenture.prebootcamp.inheritance;

public class Employee {

    String name;
    public double salary;
    protected int age;

    public Employee() {

    }

    public Employee(String name) {
        super();
        System.out.println("Employee(String name)");
    }

    public Employee(String name, String surname) {
        super();
        System.out.println("Employee(String name)");
    }

    public Employee(int age) {
        super();
        System.out.println("Employee(String name)");
    }

    String getDetails() {
        return "name - " + name + ", " +
                "salary - " + salary;
    }
}

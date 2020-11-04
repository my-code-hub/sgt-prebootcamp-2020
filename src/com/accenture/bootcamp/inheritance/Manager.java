package com.accenture.bootcamp.inheritance;

public class Manager extends Employee {
    String department;

    public Manager() {
        System.out.println("Manager()");
    }

    public Manager(String department) {
        super("Peteris");
        System.out.println("Manager(String department)");
        this.department = department;
    }

    void manage() {
        getDetails();
        System.out.println(name);
    }

    String getDetails() {
        return "name - " + name + ", " +
                "salary - " + salary + ", " +
                "department - " + department;
    }

    public String toString() {
        return getDetails();
    }

    public void outputGetDetails() {
        System.out.println(getDetails());

        System.out.println(super.getDetails());
    }
}

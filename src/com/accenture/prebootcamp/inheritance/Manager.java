package com.accenture.prebootcamp.inheritance;

public class Manager extends Employee {
    String department;

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

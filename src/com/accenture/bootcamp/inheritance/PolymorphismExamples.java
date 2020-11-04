package com.accenture.bootcamp.inheritance;

public class PolymorphismExamples {

    public static void main(String[] args) {
        //primitive data types:
        int x = 5; //initialize and delcare in single statment
        boolean trueOrFalse = true;

        int number; //declare
        number = 10; //initialize
        System.out.println(number);
        ////

        Employee employee;

        Employee employee2 = null;

        //null pointer exception
        //System.out.println(employee2.getDetails());

        System.out.println("Hello!");

        Employee employee3 = new Employee();
        employee3.name = "Employee3";
        System.out.println(employee3.getDetails());

        Employee manager = new Manager();
        manager.name = "manager";

        Manager manager2 = new Manager();
        manager2.name = "manager2";

        printDetails(employee3);

        printDetails(manager);

        printDetails(manager2);

        //This won't work, because manager might have
        //functionality (methods, properties) which Emplyoee doesn't have
        //Manager manager1 = new Employee();
    }

    static void printDetails(Employee employee) {
        System.out.println("Defails: " + employee.getDetails());

        if (employee instanceof Manager) {
            System.out.println(employee.name + " is manager");

            //cast
            Manager manager = (Manager) employee;
            manager.manage();
        }

        //employee.manage(); can't do this
        //because employee might not be instance of Manager
    }
}

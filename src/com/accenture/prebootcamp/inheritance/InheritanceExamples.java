package com.accenture.prebootcamp.inheritance;

public class InheritanceExamples {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Janis";
        employee.salary = 50.00;
        System.out.println(employee.getDetails());

        Manager manager = new Manager();
        manager.name = "Peteris";
        manager.salary = 70.00;
        manager.department = "IT";
        System.out.println(manager.getDetails());
        System.out.println(manager.toString());

        System.out.println("************");
        manager.outputGetDetails();
    }
}

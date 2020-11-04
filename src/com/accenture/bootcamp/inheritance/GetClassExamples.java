package com.accenture.bootcamp.inheritance;

public class GetClassExamples {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee2 = new Manager();

        if (employee.getClass() == Employee.class) {
            System.out.println(1);
        }

        if (employee2.getClass() == Employee.class) {
            System.out.println(2);
        }

        if (employee.getClass() == Manager.class) {
            System.out.println(3);
        }

        if (employee2.getClass() == Manager.class) {
            System.out.println(4);
        }
    }
}

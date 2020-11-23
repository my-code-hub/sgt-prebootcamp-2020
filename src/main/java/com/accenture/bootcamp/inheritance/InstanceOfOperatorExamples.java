package com.accenture.bootcamp.inheritance;

public class InstanceOfOperatorExamples {

    public static void main(String[] args) {
        Employee employee = new Employee();

        Employee employee2 = new Manager();

        if (employee instanceof Employee) {
            System.out.println(1);
        }

        if (employee2 instanceof Employee) {
            System.out.println(2);
        }

        if (employee instanceof Manager) {
            System.out.println(3);
        }

        if (employee2 instanceof Manager) {
            System.out.println(4);
        }

        castExample(employee2);

    }

    static void castExample(Employee employeeOrManager) {
        if (employeeOrManager instanceof Manager) {
            Manager manager = (Manager) employeeOrManager;
        }
    }
}

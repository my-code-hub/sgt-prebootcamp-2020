package com.accenture.prebootcamp.lesson7;

public class ControlFlowExamples {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        //if example
        if (a && b) {
            System.out.println("a && b is true");
        }

        System.out.println("******************");

        //if else example
        if (a && b) {
            System.out.println("a and b is true");
        } else {
            System.out.println("a or b is not true");
        }

        System.out.println("******************");

        a = true;
        b = false;
        boolean c = true;
        //if, else if, else example
        if (a && b && c) {
            System.out.println("a and b and c is true");
        } else if (a) {
            System.out.println("a is true");
        } else if (b) {
            System.out.println("b is true");
        } else if (c) {
            System.out.println("c is true");
        } else {
            System.out.println("none of them are true");
        }
    }
}

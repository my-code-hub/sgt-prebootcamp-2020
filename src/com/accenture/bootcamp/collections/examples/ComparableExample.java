package com.accenture.bootcamp.collections.examples;

public class ComparableExample {

    public static void main(String[] args) {
        System.out.println("Integer.compare(5, 5): " + Integer.compare(5, 5));
        System.out.println("Integer.compare(5, 6): " + Integer.compare(5, 6));
        System.out.println("Integer.compare(4, 5): " + Integer.compare(4, 5));

        System.out.println(" \n\n******************\n\n ");

        System.out.println("\"B\".compareTo(\"B\"): " +
                ("B".compareTo("B")));
        System.out.println("\"B\".compareTo(\"C\"): " +
                ("B".compareTo("C")));
        System.out.println("\"A\".compareTo(\"B\"): " +
                ("B".compareTo("A")));
    }
}

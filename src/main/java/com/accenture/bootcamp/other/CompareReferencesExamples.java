package com.accenture.bootcamp.other;

public class CompareReferencesExamples {

    public static void main(String[] args) {
        String name1 = "Hello";
        String name2 = "Hello";

        if (name1 != null && name1.equals(name2)) {
            System.out.println("Equal!");
        } else {
            System.out.println("Not equal!");
        }
    }
}

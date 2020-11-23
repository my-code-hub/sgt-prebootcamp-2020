package com.accenture.bootcamp.exceptions.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsExamples2 {

    public static void main(String[] args) {
        method1();

        System.out.println("**********************8");

        example1();

        System.out.println("end of program!");
    }

    static void method1() {
        try {
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ///
    }

    static void method2() throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println("open file!");
    }

    static void example1() {
        System.out.println("example1");
        example2();
    }

    static void example2() {
        System.out.println("example2");
        try {
            example3();
        } catch (IllegalArgumentException e) {
            System.out.println("handling exception " + e.getMessage());
        }
    }

    static void example3() {
        System.out.println("example3");
        throw new IllegalArgumentException("Hello from method example3");
    }
}

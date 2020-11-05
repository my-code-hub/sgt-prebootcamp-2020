package com.accenture.bootcamp.exceptions.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnheckedExceptionExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        //outputIndex(numbers, 6);

        try {
            File file = new File("E://file.txt");
            FileReader fileReader = new FileReader(file);
            outputIndex(numbers, 6);
            System.out.println("file opened!");
        } catch (Exception exception) {
            System.out.println("message: " + exception.getMessage());
        } finally {
            System.out.println("finally block!");
        }

        System.out.println("end of program!");
    }

    static void outputIndex(int[] numbers, int index) {
        System.out.println(numbers[index]);
    }
}

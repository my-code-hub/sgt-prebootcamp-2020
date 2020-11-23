package com.accenture.prebootcamp.lesson11.exercises;

//5. Declare and initialize array with four arbitrary whole numbers.
// Write a Java program to copy this array by iterating it.
public class Exercise5 {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        int[] numbersCopy = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersCopy[i] = numbers[i];
        }

        //output the new array
        for (int i = 0; i < numbersCopy.length; i++) {
            System.out.print(numbersCopy[i] + " ");
        }
    }
}

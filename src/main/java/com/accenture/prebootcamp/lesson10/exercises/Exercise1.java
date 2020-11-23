package com.accenture.prebootcamp.lesson10.exercises;

//1. declare and initialize array with six arbitrary whole numbers. Write a code which:
//    1) prints out all of the numbers from array
//    2) prints out all of the numbers from array in reverse order
public class Exercise1 {

    public static void main(String[] args) {
        // the same as int[] numbers = {2, 3, 5, 2, 5, 7};
        int[] numbers = new int[]{2, 3, -50, 2, 5, 7};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

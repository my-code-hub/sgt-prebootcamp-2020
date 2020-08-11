package com.accenture.prebootcamp.lesson5.exercises;

// 6) Write a Java program to print the sum of two numbers.
//    Test Data:
//    74 + 36
//    Expected Output :
//    Result is 110
public class Exercise6 {

    public static void main(String[] args) {
        //wrong
        System.out.println("Result is " + 74 + 36);

        //correct
        System.out.println("Result is " + (74 + 36));
    }
}

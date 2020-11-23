package com.accenture.prebootcamp.lesson7.exercises;

import java.util.Scanner;

//1. Write a Java program to get a number from the user
// and print whether it is positive, negative or zero.
//    Test Data
//        Input number: 35
//    Expected Output :
//        Number is positive
public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
        input.close();
    }
}

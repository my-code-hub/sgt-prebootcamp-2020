package com.accenture.prebootcamp.lesson8.exercises;

import java.util.Scanner;

//4) Ask user to input two whole numbers. Write a program which prints all
// even numbers between the numbers which user did input.
// If first number is greater than second, then print message
// "First number has to be less than second."
// and ask the user to enter the numbers again.
public class Exercise4 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n1, n2;
        boolean isValidInput;
        do {
            System.out.print("enter first number: ");
            n1 = userInput.nextInt();

            System.out.print("enter second number: ");
            n2 = userInput.nextInt();

            if (n1 < n2) {
                isValidInput = true;
            } else {
                System.out.println("First number has to be less than second.");
                isValidInput = false;
            }
        } while (!isValidInput);


        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}

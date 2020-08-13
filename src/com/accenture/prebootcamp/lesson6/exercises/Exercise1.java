package com.accenture.prebootcamp.lesson6.exercises;

import java.util.Scanner;

//1) Write Java program to allow the user to input two integer
// values and then the program prints the results of adding,
// subtracting, multiplying, and dividing among the two values.
//
//       Enter value a: 30
//       Enter value b: 10
//
//       The result 30 + 10 is 40.
//       The result 30 - 10 is 20;
//       The result of 30 * 10 is 300.
//       The result of 30 / 10 is 3.
public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number a: ");
        int a = input.nextInt();
        System.out.print("Please enter number b: ");
        int b = input.nextInt();

        System.out.println("The result of " + a + " + " + b + " is " + (a + b));
        System.out.println("The result of " + a + " - " + b + " is " + (a - b));
        System.out.println("The result of " + a + " * " + b + " is " + (a * b));
        System.out.println("The result of " + a + " / " + b + " is " + (a / b));

        input.close();
    }
}

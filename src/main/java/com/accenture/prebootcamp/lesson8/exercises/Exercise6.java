package com.accenture.prebootcamp.lesson8.exercises;

import java.util.Scanner;

//6) Two numbers are entered through the keyboard. Write a program
// to find the value of one number raised
// to the power of another. (Do not use available Java built-in method)
public class Exercise6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = input.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = input.nextInt();

        int result = base;
        for (int i = 1; i < exponent; i++) {
            result *= base;
        }

        System.out.println(base + " ^ " + exponent + " = " + result);

        //example of using built-int method
        double result2 = Math.pow(base, exponent);
        System.out.println("Answer = " + result2);

        input.close();
    }
}

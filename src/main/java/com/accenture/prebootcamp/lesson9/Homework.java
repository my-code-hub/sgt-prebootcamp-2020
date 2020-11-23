package com.accenture.prebootcamp.lesson9;

import java.util.Scanner;

//Homework - loops:
//   Write a java program which asks user to input two numbers. Print the sum
//   of all numbers from the lowest to
//   the highest number which user entered.
//   Example 1:
//      Please enter first number: 5
//      Please enter second number: 10
//   Output:
//      Sum all of numbers from 5 to 10 is 45
//   Example 2:
//      Please enter first number: 10
//      Please enter second number: 5
//   Output:
//      Sum all of numbers from 5 to 10 is 45
public class Homework {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int n1 = input.nextInt();

        System.out.print("Please enter second number: ");
        int n2 = input.nextInt();

        int from, to;
        if (n1 < n2) {
            from = n1;
            to = n2;
        } else if (n2 < n1) {
            from = n2;
            to = n1;
        } else {
            System.out.println("Both numbers are the same. Exiting program.");
            return;
        }

        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }

        System.out.println("Sum of all numbers from " + from + " to " + to + " is " + sum);
    }
}

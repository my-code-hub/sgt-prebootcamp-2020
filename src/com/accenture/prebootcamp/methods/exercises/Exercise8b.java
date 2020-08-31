package com.accenture.prebootcamp.methods.exercises;

import java.util.Scanner;

/*
8.2 Implement a method "printNumbersFromLowestToHighest" with two whole numbers as parameters (n1 and n2)
   and prints out all the numbers from lowest to highest. For example:
   printNumbersFromLowestToHighest(10, 5); // this method call will print out numbers 5, 6, 7, 8, 9, 10
   printNumbersFromLowestToHighest(5, 10); // this method call will also print out numbers 5, 6, 7, 8, 9, 10
   printNumbersFromLowestToHighest(3, 1);  // this method call will print out numbers 1, 2, 3

 */
public class Exercise8b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter nr. 1: ");
        int number1 = sc.nextInt();

        System.out.println("enter nr. 2: ");
        int number2 = sc.nextInt();

        printNumbersFromLowestToHighest(number1, number2);
        System.out.println(); //output empty line
        printNumbersFromLowestToHighest2(number1, number2);
    }

    static void printNumbersFromLowestToHighest(int n1, int n2) {
        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.print(i + " ");
            }
        } else if (n2 < n1) {
            for (int i = n2; i <= n1; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("both numbers are equal: " + n1);
        }
    }

    //another, better way
    static void printNumbersFromLowestToHighest2(int n1, int n2) {
        int from, to;
        if (n1 < n2) {
            from = n1;
            to = n2;
        } else {
            from = n2;
            to = n1;
        }
        for (int i = from; i <= to; i++) {
            System.out.print(i + " ");
        }
    }
}

package com.accenture.prebootcamp.lesson11.exercises;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        System.out.print("Please enter a number: ");

        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();

        //create array and fill array with fibonacci numbers
        int [] fibonacciSequence = new int[limit];

        //variables for remembering current, previous and 2nd previous variable
        int current = 0, prev1 = 1, prev2;
        for (int i = 0; i < limit; i++) {
            //save the current sequence number in array
            fibonacciSequence[i] = current;

            //update previous variables
            prev2 = prev1;
            prev1 = current;
            //calculate the next sequence number
            current = prev1 + prev2;
        }

        //output the array
        for (int i = 0; i < fibonacciSequence.length; i++) {
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}

package com.accenture.prebootcamp.lesson6.exercises;

import java.util.Scanner;

//6) Ask user to input a whole number and output true,
// if it is even number and false if it is odd number
//    Hint: use reminder operator to divide number by two
//    and get reminder (if reminder is 0 then it means it is even
//    number)
public class Exercise6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter whole number: ");
        int number = input.nextInt();

        boolean isEvenNumber = (number % 2) == 0;
        System.out.println("Even number? " + isEvenNumber);

        //another way
        System.out.println("Even number? " + ((number % 2) == 0));

        int reminder = number % 2;
        System.out.println("Reminder: " + reminder);

        System.out.println("reminder == 0 -> " + (reminder == 0));
    }
}

package com.accenture.prebootcamp.lesson7.exercises;

import java.util.Scanner;

//2. Write a program that asks user to input number and prints out the name
// of the corresponding day. If user inputs any other number than 1 - 7, then print
// out "There is no  such day, please enter numbers 1 - 7!"
//    example 1:
//        Input: 1
//        Output: Monday
//    example 2:
//        Input: 7
//        Output: Sunday
public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input day of the week: ");
        int dayOfWeek = input.nextInt();

        if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("There is no such day, please enter numbers 1 - 7!");
        }
    }
}

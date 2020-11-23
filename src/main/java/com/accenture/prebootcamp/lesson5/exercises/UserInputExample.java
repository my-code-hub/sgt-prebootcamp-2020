package com.accenture.prebootcamp.lesson5.exercises;

import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();
        System.out.println(number);

        System.out.println(userInput.nextInt());

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = userInput.nextFloat();
        System.out.println("Float entered = " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = userInput.nextDouble();
        System.out.println("Double entered = " + myDouble);

        // Getting String input
        System.out.print("Enter text: ");
        String myString = userInput.nextLine();
        System.out.println("Text entered = " + myString);

        // Getting String input
        System.out.print("Enter text: ");
        String myString2 = userInput.nextLine();
        System.out.println("Text entered = " + myString2);

        userInput.close();
    }
}

package com.accenture.bootcamp.exceptions.exercises;

import java.util.Scanner;

public class Exercise22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TODO modify this program so it would parse user input and assign the
        //result to "int number" variable (hint: use Integer.parseInt method)
        //and then output the number.
        //If user inputs text instead of numeric value, the program should display:
        //     "Only numeric values allowed!"
        //and ask the user to input value again untill user inputs valid numeric value.

        int number;
        do {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Only numberic values allowed!");
            }
        } while(true);
        //TODO uncomment this code
        System.out.println("number " + number);
    }
}

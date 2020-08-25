package com.accenture.prebootcamp.lesson11.exercises;

import java.util.Scanner;

//4. Declare and initialize array with six arbitrary whole numbers.
// Write a Java program  which asks input from user (a
// whole number) and tests if an array contains this value. The program finishes
// only after user has entered a number which exists in array two times.
public class Exercise4 {

    public static void main(String[] args) {
        //Declare and initialize array with six arbitrary whole numbers.
        int [] numbers = {10, 5, 3, 12, 2, 1};
        int requiredCorrectGuesses = 2;

        Scanner input = new Scanner(System.in);
        int correctGuessesCount = 0;
        //Integer is a non-primitive alternative for int data type
        Integer [] correctGuesses = new Integer[requiredCorrectGuesses];
        do {
            System.out.print("enter your guess: ");
            int guess = input.nextInt();

            //check if user didn't guess this number already
            boolean isValidNumber = true;
            for (int i = 0; i < correctGuesses.length; i++) {
                if (guess == correctGuesses[i]) {
                    System.out.println("You already guessed this number!");
                    isValidNumber = false;
                    break;
                }
            }

            //if user did guess this number already, ask him to do guess again
            if (!isValidNumber) {
                //let's start do .. while loop again.
                continue;
            }

            for (int i = 0; i < numbers.length; i++) {
                if (guess == numbers[i]) {
                    correctGuesses[correctGuessesCount] = guess;
                    correctGuessesCount++;
                    System.out.println("Correct! Correct guesses: " + correctGuessesCount);
                    //use break to stop searching for correct guess and exit loop
                    break;
                }
            }
        } while (correctGuessesCount < requiredCorrectGuesses);
    }
}

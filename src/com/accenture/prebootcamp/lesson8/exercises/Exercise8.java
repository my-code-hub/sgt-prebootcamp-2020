package com.accenture.prebootcamp.lesson8.exercises;

import java.util.Random;
import java.util.Scanner;

//8) Write a program that generates a random number and asks the
// user to guess what the number is. If the user's guess
//    is higher than the random number, the program should display
//    "Too high, try again." If the user's guess is lower
//    than the random number, the program should display "Too low, try again."
//    The program should use a loop that
//    repeats until the user correctly guesses the random number.
//
//    Hint: to find out how to generate a random number, please google "Java generate random number"
public class Exercise8 {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);

        System.out.print("guess the number: ");

        Scanner input = new Scanner(System.in);
        int userGuess;
        do {
            userGuess = input.nextInt();
            if (userGuess > number) {
                System.out.print("Too high, try again: ");
            } else if (userGuess < number) {
                System.out.print("Too low, try again: ");
            }
        } while (userGuess != number);

        System.out.println("Congratz! You won!");
        input.close();
    }
}

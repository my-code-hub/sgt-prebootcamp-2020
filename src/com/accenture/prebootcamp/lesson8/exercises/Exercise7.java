package com.accenture.prebootcamp.lesson8.exercises;

import java.util.Scanner;

//7) Modify Exercise1 from lesson 7 so the program doesn't
// terminate after first time user entered a number, but keeps
// asking user number and outputting result 3 times. (use do-while loop)
public class Exercise7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputCounter = 0;
        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number > 0) {
                System.out.println("Number is positive");
            } else if (number < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }
        } while(++inputCounter < 3);

        input.close();
    }
}

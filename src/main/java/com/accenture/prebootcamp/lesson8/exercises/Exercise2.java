package com.accenture.prebootcamp.lesson8.exercises;

//2) Write a program to print numbers from 10 to -10.
// Implement three variations of this exercise: with for loop, while
// loop and do while loop.
public class Exercise2 {

    public static void main(String[] args) {
        System.out.println("*** while loop ***");
        int counter = 10;
        while (counter >= -10) {
            System.out.print(counter + " ");
            counter--;
        }

        System.out.println("\n\n*** do while loop ***");
        int counter2 = 10;
        do {
            System.out.print(counter2 + " ");
            counter2--;
        } while (counter2 >= -10);

        System.out.println("\n\n*** for loop ***");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
    }
}

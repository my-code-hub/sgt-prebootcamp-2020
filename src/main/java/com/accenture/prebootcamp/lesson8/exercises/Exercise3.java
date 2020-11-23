package com.accenture.prebootcamp.lesson8.exercises;

//3) Write a program to print every second number from 1 to 20
//    (implement it with for and also with while loop)
//    Example:
//        1, 3, 5 ... and so on
//    And make sure there is no comma after the last number. :)
public class Exercise3 {

    public static void main(String[] args) {
        int limit = 20;

        System.out.println("*** for loop ***");
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i);
            if (i + 2 <= limit) {
                System.out.print(", ");
            }
        }

        System.out.println("\n\n *** while loop ***");

        int it = 1;
        while (it <= limit) {
            System.out.print(it);
            if (it + 2 <= limit) {
                System.out.print(", ");
            }
            it += 2;
        }
    }
}

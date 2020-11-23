package com.accenture.prebootcamp.methods.exercises;

import java.sql.SQLOutput;

//12. Implement a method "search" which has two parameters
// (array of whole numbers called "numbers" and a whole number called "number")
//    and checks if array "numbers" contains "number" and if it does, then it returns the index of the number;
//    Here is example of how to use the method:
//        // in ararys we start counting indexes from 0.
//        // So number 3 has index 0, number 12 has index 1 and so forth
//        int[] numbers = {3, 12, 2};
//        int result = search(numbers, 12);
//        System.out.println(result); //this should print 1 (because number 12 has index 1)
public class Exercise12 {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5};
        int number = 5;

        System.out.println(search(numbers, number));

        int number2 = 2;
        int result = search(numbers, number2);
        System.out.println(result);

        int number3 = 10;
        int result2 = search(numbers, number3);
        System.out.println(result2);
    }

    static int search(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }
}

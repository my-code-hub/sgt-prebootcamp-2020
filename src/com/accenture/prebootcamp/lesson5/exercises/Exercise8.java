package com.accenture.prebootcamp.lesson5.exercises;


//8) Write a Java program calculates and prints the result of
//   the following operations.
//      a. -5 + 8 * 6
//      b. (55+9) % 9
//      c. 20 + -3*5 / 8
//      d. 5 + 15 / 3 * 2 - 8 % 3
//  Expected Output :
//        43
//        1
//        19
//        13
public class Exercise8 {

    public static void main(String[] args) {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        //the same, but with assigning the value to variable
        int result = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(result);
    }
}

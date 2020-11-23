package com.accenture.prebootcamp.lesson6.exercises;

import java.util.Scanner;

//4) Ask user to input two numbers, compare them and output result:
//   Input:
//       Enter value a: 10
//       Enter value b: 10
//   Expected output:
//       is 10 equal to 10? - true
//       is 10 less than 10? - false
//       is 10 less or equal to 10? - true
//       is 10 greater than 10? - false
//       is 10 greater or equal to 10? - true
public class Exercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        int a = input.nextInt();

        System.out.print("Enter value b: ");
        int b = input.nextInt();

        System.out.println("is " + a + " equal to " + b + " ? - " + (a == b));
        System.out.println("is " + a + " less than " + b + " ? - " + (a < b));
        System.out.println("is " + a + " less or equal to " + b + " ? - " + (a <= b));
        System.out.println("is " + a + " greater than " + b + " ? - " + (a > b));
        System.out.println("is " + a + " greater or equal to " + b + " ? - " + (a >= b));

        input.close();
    }
}

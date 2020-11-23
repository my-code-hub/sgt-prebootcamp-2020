package com.accenture.prebootcamp.lesson6.exercises;

import java.util.Scanner;

//5) Ask user to input two boolean values and compare them.
//    Input:
//       Enter b1: true
//       Enter b2: false
//
//    Expected output:
//       Is b1 and b2 equal? - false
public class Exercise5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter b1: ");
        boolean b1 = input.nextBoolean();
        System.out.print("Enter b2: ");
        boolean b2 = input.nextBoolean();

        System.out.println("Is b1 and b2 equal? - " + (b1 == b2));

        //another way
        boolean result = b1 == b2;
        System.out.println("Is b1 and b2 equal? - " + result);
        input.close();
    }
}

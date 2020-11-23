package com.accenture.prebootcamp.lesson7.exercises;

import java.util.Scanner;

//3. Write a program that asks user to input three numbers:
//   and prints out the greatest number:
//    example:
//        input:
//            Please input number 1: 10
//            Please input number 2: 100
//            Please input number 3: 54
//        output:
//            greatest number is 100!
public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number 1: ");
        int n1 = input.nextInt();

        System.out.print("Please enter number 2: ");
        int n2 = input.nextInt();

        System.out.print("Please enter number 3: ");
        int n3 = input.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Greatest number is " + n1 + "!");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("Greatest number is " + n2 + "!");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("Greatest number is " + n3 + "!");
        } else {
            System.out.println("There is no greatest number");
        }
    }
}

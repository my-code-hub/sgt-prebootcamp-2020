package com.accenture.prebootcamp.lesson6.homework;

import java.util.Scanner;

//5) Write a program which reads boolean value from user
//   and prints out the opposite value:
//    Example input:
//        Enter boolean value: true
//    Expected output:
//        Opposite of "true" is "false"
public class Homework1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input boolean value: ");
        boolean var = input.nextBoolean();

        System.out.println("Opposite of \"" + var + "\" is \"" + !var + "\"");
    }
}

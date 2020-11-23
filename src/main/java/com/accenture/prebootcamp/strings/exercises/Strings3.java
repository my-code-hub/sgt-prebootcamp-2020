package com.accenture.prebootcamp.strings.exercises;

import java.util.Scanner;

//3. Write a java program to get the length of a given string.
//    Example:
//        Input string: example.com
//    Output:
//        The string length of 'example.com' is: 11
public class Strings3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.println("The string length of '" + text + "''is: "
                + text.length());
    }
}

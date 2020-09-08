package com.accenture.prebootcamp.strings.exercises;

import java.util.Scanner;

//8. Write a Java program to trim any leading or trailing whitespace
//   from a given string.
//    Example:
//        Input text:     hello, world!
//    Output:
//        "hello, world!"
public class Strings8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.println("\"" + text.trim() + "\"");
    }
}

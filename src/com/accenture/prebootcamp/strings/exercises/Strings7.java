package com.accenture.prebootcamp.strings.exercises;

import java.util.Scanner;

//7. Ask user to input any string and output the same string in
//   uppercase.
//    Example:
//        Input text: hello, world!
//    Output:
//        HELLO, WORLD!
public class Strings7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        System.out.println(text.toUpperCase());
    }
}

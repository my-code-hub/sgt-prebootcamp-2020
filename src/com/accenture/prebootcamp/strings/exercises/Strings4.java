package com.accenture.prebootcamp.strings.exercises;

import java.util.Scanner;

//4. Ask user to input string. Write a Java program to replace all the 'd' characters with 'f' characters.
//    Example:
//        Please input text: The quick brown fox jumps over the lazy dog.
//    Output:
//        The quick brown fox jumps over the lazy fog.
public class Strings4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();
        System.out.println(text.replace("d", "f"));
    }
}

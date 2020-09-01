package com.accenture.prebootcamp.strings.exercises;

import java.util.Scanner;

//2. Ask user to input two strings. Then compare if those two
// strings are the same (ignore case sensitivity) and output
//  the result. Comparing strings should NOT be case sensitive
//  ("Hello" and "hello" is considered to be equal)
//    Example:
//        Input text 1: Hello
//        Input text 2: hello
//    Output:
//        "Hello" is equal to "hello"
public class Strings2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string 1: ");
        String s1 = input.nextLine();

        System.out.print("Enter a string 2: ");
        String s2 = input.nextLine();

        String message = "\"" + s1 + "\" %s equal to \"" + s2 + "\"";
        String result = s1.equalsIgnoreCase(s2) ? "is" : "isn't";
        System.out.println(String.format(message, result));
    }
}

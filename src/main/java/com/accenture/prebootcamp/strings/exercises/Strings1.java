package com.accenture.prebootcamp.strings.exercises;

import java.util.Scanner;

//1. Ask user to input two strings. Then compare if those two strings are the
// same and output the result. Comparing strings should be case sensitive
// ("Hello" and "hello" should not be equal)
//    Example:
//        Input text 1: Hello, world!
//        Input text 2: Hello, John!
//    Output:
//        "Hello, world!" is not equal to "Hello, John!"
public class Strings1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string 1: ");
        String s1 = input.nextLine();

        System.out.print("Enter a string 2: ");
        String s2 = input.nextLine();

        //simple solution, but not the shortest
        if (s1.equals(s2)) {
            System.out.println("\"" + s1 + "\" is equal to \"" + s2 + "\"");
        } else {
            System.out.println("\"" + s1 + "\" isn't equal to \"" + s2 + "\"");
        }



        System.out.println("******** solution 2 **********");
        String result;
        if (s1.equals(s2)) {
            result = "is";
        } else {
            result = "isn't";
        }
        System.out.println(String.format("\"" + s1 + "\" %s equal to \"" + s2 + "\"", result));
        //read more about String.format:
        //https://www.javatpoint.com/java-string-format
        //https://www.geeksforgeeks.org/java-string-format-examples/




        System.out.println("********* solution 3 *********");
        //we are using ternary operator here
        //read more - https://www.tutorialspoint.com/Java-Ternary-Operator-Examples
        result = s1.equals(s2) ? "is" : "isn't";
        String message = "\"" + s1 + "\" %s equal to \"" + s2 + "\"";
        System.out.println(String.format(message, result));
    }
}

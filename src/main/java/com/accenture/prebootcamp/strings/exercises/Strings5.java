package com.accenture.prebootcamp.strings.exercises;

import java.util.Scanner;

//5.  Ask user to input any string. Write a Java program to check whether a
//    given string starts with "Hello" or ends with "bye!".
//     Example:
//        Please input text: Hello, everyone!
//     Output:
//        Starts with "Hello"? true
//        Ends with "bye!"? false
public class Strings5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        boolean startsWithHello = text.startsWith("Hello");
        boolean endsWithBye = text.endsWith("bye!");

        System.out.println("Starts with \"Hello\"? " + startsWithHello);
        System.out.println("Ends with \"bye!\"? " + endsWithBye);
    }
}

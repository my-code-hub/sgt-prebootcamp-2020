package com.accenture.prebootcamp.strings.exercises;

import java.util.Scanner;

//6. Ask user to input string and two numbers ("start" and "end"). Output the part of the text from this string:
//    which starts at number "start" and ends at number "end" (both inclusive).
//    Example:
//        Input text: The quick brown fox jumps over the lazy dog.
//        Input start: 5
//        Input end: 13
//    Output:
//        "quick bro"
//
//    !Hint: make sure that program works if we enter negative start/end number or too high start/end number.
public class Strings6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = input.nextLine();

        int textSize = text.length();
        int start = getNumberInput(input, "start", 0, (textSize - 1)),
                end = getNumberInput(input, "end", (start + 1), textSize);


        System.out.println(text.substring(start, end));
    }

    static int getNumberInput(Scanner input, String name, int min, int max) {
        int number;
        boolean isValidInput;
        System.out.print("please input " + name + " number: ");
        do {
            number = input.nextInt();
            if (number > max || number < min) {
                System.out.print("number has to be in range from " + min + " to "
                        + max + ". try again: ");
                isValidInput = false;
            } else {
                isValidInput = true;
            }
        } while (!isValidInput);
        return number;
    }
}

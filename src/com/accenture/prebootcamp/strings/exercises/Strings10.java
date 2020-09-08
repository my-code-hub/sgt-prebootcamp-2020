package com.accenture.prebootcamp.strings.exercises;

import java.util.Scanner;

//10. Ask user to input string. Write a Java program to reverse every
//    word in a string using methods.
//    Example input:
//        This is a test string
//    Output:
//        sihT si a tset gnirts
public class Strings10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");

        String[] words = input.nextLine().split("\\s");

        for (String word : words) {
            System.out.print(reverse(word) + " ");
        }
    }

    // multiple ways of reversing strings:
    // https://www.geeksforgeeks.org/reverse-a-string-in-java/
    static String reverse(String value) {
        char[] characters = value.toCharArray();
        int left = 0, right = characters.length - 1;
        for (; left < right; left++, right--) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
        }
        return new String(characters);
    }
}

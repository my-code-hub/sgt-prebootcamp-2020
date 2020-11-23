package com.accenture.prebootcamp.strings.exercises;

import java.util.Random;
import java.util.Scanner;

//9. Write a program which asks the user to input sentence. Split the sentence
//   into words and output all words in random order.
//    Example:
//        Input text: The quick brown fox jumps over the lazy dog
//    Output:
//        jumps quick lazy over The brown dog jumps fox the
public class Strings9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter text: ");

        String[] words = input.nextLine().split("\\s");

        shuffle(words);

        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    // how to shuffle array?
    // https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
    // https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
    static void shuffle(String[] array) {
        int index;
        String temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}

package com.accenture.prebootcamp.strings.exercises;

import java.util.Scanner;

//11. Write a java program which asks user to input sentence and counts
//    how many each letter appears in sentence and outputs the result.
//    (uppercase and lowercase should be considered as the same symbol)
//    Example input: hello! How are you?
//    Example output:
//        h - 2
//        e - 2
//        l - 2
//        o - 3
//        ! - 1
//        w - 1
//        a - 1
//        r - 1
//        y - 1
//        u - 1
//        ? - 1
public class Strings11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        int[] characterCount = countCharacters(text);
        outputCharacterCount(characterCount);
    }

    // hello
    // [h, e,  l, l, o]
    // 12  10  2  5  9
    static int[] countCharacters(String text) {
        String textLowercase = text.toLowerCase();
        char[] characters = textLowercase.toCharArray();
        int[] characterCount = new int[256];
        for (int i = 0; i < characters.length; i++) {
            //Every character can actually be represented by a number.
            //Java uses UTF-16 charset internally - https://asecuritysite.com/coding/asc2?val=0%2C255
            // interesting read:
            // https://stackoverflow.com/questions/2241348/what-is-unicode-utf-8-utf-16
            //more interesting read:
            //https://www.joelonsoftware.com/2003/10/08/the-absolute-minimum-every-software-developer-absolutely-positively-must-know-about-unicode-and-character-sets-no-excuses/
            //transform character to number
            int charAsNumber = characters[i];
            characterCount[charAsNumber]++;
        }
        return characterCount;
    }

    static void outputCharacterCount(int[] characterCount) {
        for (int i = 0; i < characterCount.length; i++) {
            int count = characterCount[i];
            if (count > 0) {
                char character = (char) i;
                System.out.println(character + " - " + count);
            }
        }
    }
}

package com.accenture.bootcamp.collections.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise32 {

    //TODO Write a program which counts how many unique words are in text (see class Text, variable TEXT)
    //Think of how you could use any of the Set implementation to implement
    //this program.

    // Bonus:
    // Ignore case sensitivity. For example, Apple and apple should be counted as the same word.

    public static void main(String[] args) {
        solutionExample1();

        solutionExample2();

        solutionExample3();
    }

    static void solutionExample1() {
        String[] words = Text.TEXT.toLowerCase().split("\\s+");

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println("unique words: " + uniqueWords.size());
    }

    static void solutionExample2() {
        String[] words = Text.TEXT.split("\\s+");

        List<String> wordsArray = Arrays.asList(words);
        Set<String> uniqueWords = new HashSet<>(wordsArray);

        System.out.println("unique words: " + uniqueWords.size());
    }

    static void solutionExample3() {
        String[] words = Text.TEXT.split("\\s+");

        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(Arrays.asList(words));

        //another approach
        //Collections.addAll(uniqueWords, words);

        System.out.println("unique words: " + uniqueWords.size());
    }
}

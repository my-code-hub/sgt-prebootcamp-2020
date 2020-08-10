package com.accenture.prebootcamp.lesson4.exercises;

public class StringExamples {

    public static void main(String[] args) {
        //declare string variables
        String name;

        //assign value
        name = "Ritvars";

        //output value of variable "name"
        System.out.println(name);


        // delcare and assign in a single statement
        String sentence = "My name is ";
        System.out.println(sentence);


        String myNameIs = sentence + name;
        System.out.println(myNameIs);

        //println vs print
        System.out.print("Hello, how are you?");

        System.out.println(" I'm fine!");

        System.out.print(" Ok. :)");

        //new line symbol
        System.out.println("\n\n\n\nTEXT\nNEW line\n\n");

        //concat multiple strings
        int number = 100;
        System.out.println("Variable number has value " + number + "." + " Literal value: " + 50);

        String longSentence = "Variable number has value " + number + "." + " Literal value: " + 50;
        System.out.println(longSentence);
    }
}

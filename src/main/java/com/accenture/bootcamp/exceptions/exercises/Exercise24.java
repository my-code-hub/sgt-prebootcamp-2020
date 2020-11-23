package com.accenture.bootcamp.exceptions.exercises;

import java.io.IOException;

public class Exercise24 {

    //TODO Call the method "helloWorld()" in "main" method of this program.
    // Did the code compile when you simply tried to call the method? If not, why so?
    // There are two ways you can adjust this program so helloWorld() method call would work.
    // Demonstrate them both.
    public static void main(String[] args) throws IOException {
        helloWorld();
    }

    //do not modify this method / code
    static void helloWorld() throws IOException {
        System.out.println("Hello world!");
    }
}

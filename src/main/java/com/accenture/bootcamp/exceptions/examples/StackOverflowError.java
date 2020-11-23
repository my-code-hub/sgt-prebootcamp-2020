package com.accenture.bootcamp.exceptions.examples;

public class StackOverflowError {

    public static void main(String[] args) {
        hello();
    }

    static void hello() {
        hello();
    }
}

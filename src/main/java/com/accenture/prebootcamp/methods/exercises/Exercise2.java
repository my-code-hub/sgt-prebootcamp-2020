package com.accenture.prebootcamp.methods.exercises;

//2. Implement a method "greetPerson" which accepts one argument (String name) and output text "Hello, <NAME>!"
//   <NAME> name is the value of argument. Write a program which demonstrates usages of this method.
//   hint: to concatenate text (add/put it together), you can use + operator.
public class Exercise2 {

    public static void main(String [] args) {
        greetPerson("John");
        greetPerson("Jane");
    }

    static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

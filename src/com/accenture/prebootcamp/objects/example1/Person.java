package com.accenture.prebootcamp.objects.example1;

public class Person {

    //instance variables or properties
    String name;
    int age;

    //default constructor
    //(it does exist already, but here we override it)
    Person() {
        System.out.println("Creating new instance of " +
                "class Person (default constructor)");
    }

    Person(String name, int personAge) {
        System.out.println("Creating new instance of class Person " +
                " with constructor Person(String personName, int personAge). " +
                "Argument values: personName = " + name + ", age = " + personAge);
        this.name = name;
        age = personAge;
    }

    Person(String name) {
        System.out.println("name: " + name);
        System.out.println("this.name: " + this.name);

        this.name = name;
    }

    //instance method
    void sayHello() {
        System.out.println("Hello, my name is " + name +
                ". And I'm " + age + " years old");
    }

    String getName() {
        return name;
    }
}

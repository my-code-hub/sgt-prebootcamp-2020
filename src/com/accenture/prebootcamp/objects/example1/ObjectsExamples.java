package com.accenture.prebootcamp.objects.example1;

public class ObjectsExamples {

    //**** AGENDA *****
    //class vs object / instance
        // https://www.javatpoint.com/difference-between-object-and-class
    //memory (stack - heap)
    //constructors
        //default and overloaded
    //properties
    //methods
    public static void main(String[] args) {
        //create an instance of class Person
        //using default constructor
        new Person();

        Person person1 = new Person();
        Person person2 = person1;

        System.out.println("person1 == person2: "
                + (person1 == person2));

        System.out.println("person1.age: " + person1.age +
                ", person1.name = " + person1.name);

        person1.name = "Janis";

        System.out.println("person2.name: " + person2.name);


    }
}

package com.accenture.prebootcamp.equals.exercises.exercise1;

public class Exercise1 {

    //- write a program which creates a few instances of Person and checks equality between them.
    //      (example where two persons are equal and not equal)
    public static void main(String[] args) {
        Person person1 = new Person("Jēkabs", 16, "LV121236");
        Person person2 = new Person("Jēkabs", 16, "LV121236");
        Person person3 = new Person("Krīstīne", 42, "LV363612");

        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));

        System.out.println("person1.equals(person1): " + person1.equals(person1));
    }
}

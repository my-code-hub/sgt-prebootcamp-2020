package com.accenture.prebootcamp.objects.exercises.exercise1;

//create class "Animal"
// with properties "type", "name" and "age"
public class Animal {
    String type;
    String name;
    int age;

    //create constructor with
    // parameters "name" and "age" for setting the properties
    Animal(String animalName, int animalAge) {
        name = animalName;
        age = animalAge;
    }

    //* create a method "makeSound" which prints "wuff!"
    // if the animal type is "dog" or "meow!" if
    //  the animal type is "cat"
    void makeSound() {
        if ("dog".equals(type)) {
            System.out.println("wuff!");
        } else if ("cat".equals(type)) {
            System.out.println("meow!");
        }
    }
}

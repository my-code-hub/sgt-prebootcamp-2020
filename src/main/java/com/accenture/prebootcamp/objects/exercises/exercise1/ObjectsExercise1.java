package com.accenture.prebootcamp.objects.exercises.exercise1;

//1. create class "Animal" with properties "type", "name" and "age"
//    * create constructor with parameters "name" and "age" for setting the properties
//    * create two objects each with different names and ages (two objects of type "cat" and one "dog")
//    * create a method "makeSound" which prints "wuff!" if the animal type is "dog" or "meow!" if
//      the animal type is "cat"
//
//    Hint: Create class ObjectsExercise1 with main method. Here you can create instances of class Animal,
//          call methods, etc.
public class ObjectsExercise1 {

    public static void main(String[] args) {
        // * create two objects each with different names and ages
        // (two objects of type "cat" and one "dog")
        Animal animal1 = new Animal("Bobis", 3);
        animal1.type = "dog";
        animal1.makeSound();

        Animal animal2 = new Animal("Luna", 4);
        animal2.type = "cat";
        animal2.makeSound();

        //more examples
        Animal animal3 = new Animal("Muris", 6);
        animal3.makeSound();

        animal3 = null;
        animal3.makeSound(); //null pointer error
    }
}

package com.accenture.bootcamp.interfaces.exercise17;

public class AnimalMain {

    public static void main(String[] args) {
        //    Create class AnimalsMain with main method and:
        //        1) Declare Animal type reference and instantiate / assign Dog instance to it
        //        2) Declare Animal type reference and instantiate / assign Cat instance to it
        //    Call methods makeSound on each of these instances.

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        detectInstance(dog);
        detectInstance(cat);
    }

    //17.2 Is - A relationship
    //     Create a static method "detectInstance" in class "AnimalsMain" with parameter of type Animal.
    //     This method should use instanceof operator to check what types of object have we passed
    //     as argument and print the corresponding message. For example:
    //        "Animal is of type Dog!"
    static void detectInstance(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Animal is of type Dog!");
        } else if (animal instanceof Cat) {
            System.out.println("Animal is of type Cat!");
        }
    }
}

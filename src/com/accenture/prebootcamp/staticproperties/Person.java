package com.accenture.prebootcamp.staticproperties;

public class Person {

    //static property
    static String name;

    //instance property
    String surname;

    //static method
    static void sayHello() {
        System.out.println("Hello! My name is " + name);

        Person p1 = new Person();
        p1.sayBye();
    }

    void sayBye() {
        System.out.println("Bye, I'm leaving! My name: " + name
                + ", surname " + surname);

        sayHello();
    }
}

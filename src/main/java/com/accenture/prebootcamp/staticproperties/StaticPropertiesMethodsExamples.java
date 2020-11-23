package com.accenture.prebootcamp.staticproperties;

import static com.accenture.prebootcamp.staticproperties.animals.Animal.animalZoo;
import static com.accenture.prebootcamp.staticproperties.animals.Animal.ZOO_NAME;

public class StaticPropertiesMethodsExamples {

    static int MIN_REGISTRATION_AGE = 15;

    public static void main(String[] args) {
        //static vs instance properties

        System.out.println(Person.name);

        Person.name = "John";

        System.out.println(Person.name);

        //System.out.println(Person.surname);

        Person person1 = new Person();
        person1.surname = "Doe";

        System.out.println(person1.surname);

        System.out.println(person1.name);

        Person person2 = new Person();
        person2.surname = "Doe 2";

        System.out.println(person2.surname);

        System.out.println(person2.name);

        Person.name = "Jane";

        System.out.println(person1.name);
        System.out.println(person2.name);

        Person.sayHello();

        //can't use instance method like this
        // Person.sayBye();

        Person person3 = new Person();
        person3.surname = "Klavins";
        person3.sayBye();

        String result = String.format("Hello, my age is %d", 50);

        System.out.println(result);

        animalZoo();

        System.out.println(ZOO_NAME);
        System.out.println(ZOO_NAME);
    }
}

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
        //There is no reference pointing to this object
        //so it will be destroyed by garbage collector
        new Person();

        //create an instance of class Person
        //using default constructor. And assign the
        //reference of this object to variable "person1"
        Person person1 = new Person();
        Person person2 = person1;

        //compare object references
        System.out.println("person1 == person2: "
                + (person1 == person2));

        //read/output property values
        System.out.println("person1.age: " + person1.age +
                ", person1.name = " + person1.name);

        //change property value
        person1.name = "Janis";

        //read/output property value
        System.out.println("person2.name: " + person2.name);

        //calling a method on person1 instance
        person1.sayHello();

        Person person3 = new Person();
        person3.age = 10;
        person3.name = "Juris";

        person3.sayHello();

        System.out.println("person1 == person3: "
                + (person1 == person3));

        String person3Name = person3.getName();
        System.out.println("person3Name: " + person3Name);

        //defining & using other constructors
        Person person4 = new Person("Martins", 25);
        person4.sayHello();


        //creating class A using default constructor
        //is not possible, because we have defined
        //constructor A(int number) in this class
        //. IF we want to use default construcytor,
        //then we have to define it explicity (same as in Person class)
        // new A(); // compilation error
    }
}

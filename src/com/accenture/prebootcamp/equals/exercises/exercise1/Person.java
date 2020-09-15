package com.accenture.prebootcamp.equals.exercises.exercise1;

import java.util.Objects;

public class Person {

    //- create class "Person" with properties "name", "age" and "personalId"
    private String name;
    private int age;
    private String personalId;

    //- create constructor with parameters "name", "age" and "personalId"
    public Person(String name, int age, String personalId) {
        this.name = name;
        this.age = age;
        this.personalId = personalId;
    }

    //- create getter methods for all of these properties
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPersonalId() {
        return personalId;
    }

    //- override equals method and change it so instances of type Person would only be equal to
    //      each other if personalId is equal.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(personalId, person.personalId);
    }

    //- also override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(personalId);
    }
}

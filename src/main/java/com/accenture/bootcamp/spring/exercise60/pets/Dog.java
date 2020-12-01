package com.accenture.bootcamp.spring.exercise60.pets;

import javax.annotation.PostConstruct;

public class Dog {
    private final Owner owner;

    public Dog(Owner owner) {
        this.owner = owner;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(getClass().getName() + " bean constructed!");
    }
}

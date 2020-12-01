package com.accenture.bootcamp.spring.exercise60.pets;

import javax.annotation.PostConstruct;

public class Cat {

    private final Owner owner;

    public Cat(Owner owner) {
        this.owner = owner;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(getClass().getName() + " bean constructed!");
    }
}

package com.accenture.bootcamp.spring.exercise60.pets;

import javax.annotation.PostConstruct;

public class House {

    private final Owner owner;
    private final Dog dog;
    private final Cat cat;

    public House(Owner owner, Dog dog, Cat cat) {
        this.owner = owner;
        this.dog = dog;
        this.cat = cat;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(getClass().getName() + " bean constructed!");
    }
}

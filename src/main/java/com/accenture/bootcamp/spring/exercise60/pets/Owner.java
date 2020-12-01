package com.accenture.bootcamp.spring.exercise60.pets;

import javax.annotation.PostConstruct;

public class Owner {

    public Owner() {
        System.out.println("Owner() constructor!");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(getClass().getName() + " bean constructed!");
    }
}

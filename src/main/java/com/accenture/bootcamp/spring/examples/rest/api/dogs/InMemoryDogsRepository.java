package com.accenture.bootcamp.spring.examples.rest.api.dogs;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Component
public class InMemoryDogsRepository implements DogsRepository {

    private List<Dog> DOGS = asList(new Dog("reksis"), new Dog("bobis"));

    public List<Dog> findByName(String name) {
        List<Dog> dogs = new ArrayList<>();
        for (Dog dog : DOGS) {
            if (dog.getName().contains(name)) {
                dogs.add(dog);
            }
        }
        return dogs;
    }
}

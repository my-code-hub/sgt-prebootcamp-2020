package com.accenture.bootcamp.spring.examples.rest.api.dogs;

import java.util.List;

public interface DogsRepository {

    List<Dog> findByName(String name);
}

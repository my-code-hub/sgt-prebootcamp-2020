package com.accenture.bootcamp.spring.examples.rest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

//REST CRUD API
@RestController
public class DogsController {

    @GetMapping("/dogs")
    public List<String> dogs(@RequestParam(required = true) String search) {
        List<String> dogs = new ArrayList<>();
        for (String dog : asList("reksis", "bobis")) {
            if (dog.contains(search)) {
                dogs.add(dog);
            }
        }
        return dogs;
    }

}

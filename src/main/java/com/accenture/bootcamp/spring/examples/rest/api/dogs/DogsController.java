package com.accenture.bootcamp.spring.examples.rest.api.dogs;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//REST API for CRUD (create read update delete)
@RestController
public class DogsController {

    private final DogsRepository dogsRepository;

    public DogsController(DogsRepository dogsRepository) {
        this.dogsRepository = dogsRepository;
    }

    @GetMapping("/dogs")
    public List<Dog> dogs(@RequestParam(required = true) String search) {
        return dogsRepository.findByName(search);
    }

    @PostMapping("/dogs")
    public void create(@RequestBody Dog dog) {
        System.out.println("creating dog..: " + dog);
        //dogsRepository.create(dog);
    }

    @PutMapping("/dogs")
    public void update(@RequestBody Dog dog) {
        System.out.println("updating dog: " + dog);
    }

    @DeleteMapping("/dogs/{id}")
    public void delete(@PathVariable Integer id) {
        System.out.println("search dog by id and delete it. ID: " + id);
    }
}

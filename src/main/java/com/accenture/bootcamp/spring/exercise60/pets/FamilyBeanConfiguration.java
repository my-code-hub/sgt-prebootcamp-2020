package com.accenture.bootcamp.spring.exercise60.pets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FamilyBeanConfiguration {

    @Bean
    public Owner owner() {
        return new Owner();
    }

    @Bean
    public Dog dog(Owner owner) {
        return new Dog(owner);
    }

    @Bean
    public Cat cat() {
        return new Cat(owner());
    }

    @Bean
    public House house(Owner owner, Cat cat, Dog dog) {
        return new House(owner, dog, cat);
    }
}

package com.accenture.bootcamp.spring.exercise60.figures;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Square implements Shape {
    @PostConstruct
    public void postConstructor() {
        System.out.println("Square!");
    }
}

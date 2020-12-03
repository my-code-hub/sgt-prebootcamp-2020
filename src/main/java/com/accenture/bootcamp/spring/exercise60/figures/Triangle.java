package com.accenture.bootcamp.spring.exercise60.figures;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Primary
@Component
public class Triangle implements Shape {

    @PostConstruct
    public void postConstructor() {
        System.out.println("Trianglage!");
    }
}

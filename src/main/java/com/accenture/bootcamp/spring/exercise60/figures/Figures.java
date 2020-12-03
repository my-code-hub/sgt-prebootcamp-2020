package com.accenture.bootcamp.spring.exercise60.figures;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Figures {

    private final Shape shape;

    public Figures(Shape shape) {
        this.shape = shape;
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("Figures: "
                + shape.getClass().getName());
    }
}

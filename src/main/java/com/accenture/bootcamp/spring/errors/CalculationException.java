package com.accenture.bootcamp.spring.errors;

public class CalculationException extends RuntimeException {

    public CalculationException(String message) {
        super(message);
    }
}

package com.accenture.bootcamp.spring.exercise61;

import org.springframework.stereotype.Component;

@Component
class CalculationValidator {

    void validateCalculation(double number2, String operation) {
        if (Operations.DIVIDE.equals(operation) && number2 == 0) {
            throw new CalculationException("Can't divide by zero!");
        }
    }
}

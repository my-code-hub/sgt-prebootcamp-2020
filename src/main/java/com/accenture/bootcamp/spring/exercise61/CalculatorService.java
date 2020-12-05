package com.accenture.bootcamp.spring.exercise61;

import org.springframework.stereotype.Service;

@Service
class CalculatorService {

    private final CalculationValidator calculationValidator;

    public CalculatorService(CalculationValidator calculationValidator) {
        this.calculationValidator = calculationValidator;
    }

    public double calculate(double number1, double number2, String operation) {
        calculationValidator.validateCalculation(number2, operation);
        switch (operation) {
            case Operations.ADD:
                return number1 + number2;
            case Operations.SUBTRACT:
                return number1 - number2;
            case Operations.MULTIPLY:
                return number1 * number2;
            case Operations.DIVIDE:
                return number1 / number2;
            default:
                throw new CalculationException("Unsupported operation " + operation);
        }
    }
}

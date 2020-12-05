package com.accenture.bootcamp.spring.exercise61;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculator;

    @Autowired
    public CalculatorController(CalculatorService calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/calculator/result")
    public Result calculate(@RequestParam double number1,
                            @RequestParam double number2,
                            @RequestParam String operation) {
        return new Result(calculator.calculate(number1, number2, operation));
    }
}

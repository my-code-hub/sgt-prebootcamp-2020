package com.accenture.bootcamp.spring.exercise61;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CalculatorExceptionHandler {

    //Similar to
    // } catch (CalculationException e) {
    // }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = CalculationException.class)
    public ErrorResponse handle(CalculationException e) {
        return new ErrorResponse(e.getMessage());
    }

    //static / inner class
    static class ErrorResponse {
        private String message;

        ErrorResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}

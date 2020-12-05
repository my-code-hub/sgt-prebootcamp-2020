package com.accenture.bootcamp.spring.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SpringExceptionHandler {

    //Similar to
    // } catch (CalculationException e) {
    // }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = CalculationException.class)
    public ErrorResponse handle(CalculationException e) {
        return new ErrorResponse(e.getMessage());
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = NotFoundException.class)
    public ErrorResponse handle(NotFoundException e) {
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

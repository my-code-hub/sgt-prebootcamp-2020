package com.accenture.bootcamp.exceptions.exercises;

//TODO 1. Create your own two exceptions
// and name them EvenNumberException (checked)
// and OddNumberException (unchecked)
public class Exercise25 {

    public static void main(String[] args) {
        checkNumber(1);
        checkNumber(2);
    }

    //TODO
    //  3. call method evenOrOdd and pass it the number argument.
    //  4. Implement error handling code in this method.
    //     a) If method evenOrOdd throws EvenNumberException,
    //        then you have to output text:
    //             [number] is even!
    //     b) If method evenOrOdd throws OddNumberException,
    //        then you have to output text:
    //             [number] is odd!
    static void checkNumber(int number) {
        try {
            evenOrOdd(number);
        } catch (EvenNumberException e) {
            System.out.println(number + " is even!");
        } catch (OddNumberException e) {
            System.out.println(number + " is odd!");
        }
    }

    static void checkNumber2(int number) {
        try {
            evenOrOdd(number);
        } catch (Exception e) {
            if (e instanceof EvenNumberException) {
                System.out.println(number + " is even!");
            } else if (e instanceof OddNumberException) {
                System.out.println(number + " is odd!");
            } else {
                throw new RuntimeException(e);
            }
        }
    }

    //TODO 2. this method has to throw
    // a) EvenNumberException exception if number is even value
    // b) OddNumberException if number is odd value
    static void evenOrOdd(int number) throws EvenNumberException {
        if (number % 2 == 0) {
            throw new EvenNumberException();
        } else {
            throw new OddNumberException();
        }
    }
}

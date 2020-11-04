package com.accenture.prebootcamp.overloading.exercise;

//15.1 Create class "OverloadedMethods" with package access and create/implement six overloaded methods
//    called "outputVariable" each with one parameter for these data
//    types: int, long, double, boolean, String, String []. Each of this method should output the
//    parameter value and also it's data type. For example:
//        output(5);     //int value - 5
//        output(5);     //String [] values - "hello", "bye"
//    Create class "OverloadedMethodsProgram" and call all of these methods with arbitrary values.
//    Bonus:
//        Create three constructors (default constructor and two overloaded constructors). Choose
//        any parameter data types you want. Output all parameters in each of the constructor.
//        In class "OverloadedMethodsProgram" use each of the construct to instantiate new object.
class OverloadedMethods {

    void outputVariable(int number) {
        System.out.println("int value - " + number);
    }

    void outputVariable(long number) {
        System.out.println("long value - " + number);
    }

    void outputVariable(double number) {
        System.out.println("double value - " + number);
    }

    void outputVariable(boolean trueOrFalse) {
        System.out.println("boolean value - " + trueOrFalse);
    }

    void outputVariable(String text) {
        System.out.println("String value - " + text);
    }

    void outputVariable(String[] values) {
        System.out.print("String [] values -");
        for (String value : values) {
            System.out.print(value + " ");
        }
    }
}

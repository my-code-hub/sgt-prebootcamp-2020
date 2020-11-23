package com.accenture.prebootcamp.overloading.exercise;

public class OverloadedMethodsProgram {

    public static void main(String[] args) {
        OverloadedMethods object = new OverloadedMethods();

        object.outputVariable(5);
        object.outputVariable(5L);
        object.outputVariable(5D);
        object.outputVariable(true);
        object.outputVariable("Hello!");
        object.outputVariable(new String[]{"apple", "orange"});
    }
}

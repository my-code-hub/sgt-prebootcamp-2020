package com.accenture.bootcamp.interfaces.examples;

public class Circle implements Shape, ColoredShape {

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public String getColour() {
        return "Green";
    }
}

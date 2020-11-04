package com.accenture.bootcamp.interfaces.examples;

public class RedTriangle extends Triangle implements ColoredShape {

    @Override
    public String getType() {
        return "RedTriangle";
    }

    @Override
    public String getColour() {
        return "Red";
    }
}

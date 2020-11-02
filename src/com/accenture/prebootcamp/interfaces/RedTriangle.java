package com.accenture.prebootcamp.interfaces;

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

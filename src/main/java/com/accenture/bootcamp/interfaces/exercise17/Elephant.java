package com.accenture.bootcamp.interfaces.exercise17;

public abstract class Elephant implements Animal {

    public abstract void makeSound();

    abstract void run();

    public void move() {
        System.out.println("moving...");
    }
}

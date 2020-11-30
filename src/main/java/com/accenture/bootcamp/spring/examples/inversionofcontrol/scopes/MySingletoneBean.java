package com.accenture.bootcamp.spring.examples.inversionofcontrol.scopes;

import java.util.Random;

public class MySingletoneBean {

    private int number = new Random().nextInt(100);

    public void outputNumber() {
        System.out.println("random number: " + number);
    }
}

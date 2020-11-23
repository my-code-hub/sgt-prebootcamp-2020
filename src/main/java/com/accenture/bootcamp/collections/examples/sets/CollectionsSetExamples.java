package com.accenture.bootcamp.collections.examples.sets;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSetExamples {

    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();

        colors.add("red");
        colors.add("red");

        System.out.println("colors.size() " + colors.size());

        Car car = new Car("abc1");
        Car car2 = new Car("abc1");

        System.out.println("car.equals(car2): "
                + car.equals(car2));

        Set<Car> cars = new HashSet<>();
        cars.add(car);
        boolean isAdded = cars.add(car2);

        System.out.println("isAdded: " + isAdded);

        System.out.println("cars.size() " + cars.size());
    }
}

// key - value

// Riga - 1 000 000

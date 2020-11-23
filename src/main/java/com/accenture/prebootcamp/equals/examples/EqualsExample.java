package com.accenture.prebootcamp.equals.examples;

public class EqualsExample {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("19ASDH12DHA", "BMW", 250);
        Vehicle vehicle2 = new Vehicle("19ASDH12DHA", "BMW", 250);

        boolean result = vehicle1 == vehicle2;
        System.out.println("result: " + result);

        System.out.println("vehicle1.equals(vehicle2): "
                + vehicle1.equals(vehicle2));

        System.out.println("John".equals("John"));
    }
}

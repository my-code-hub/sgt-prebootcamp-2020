package com.accenture.prebootcamp.equals.examples;

import java.util.Objects;

//TODO read more:
//https://www.geeksforgeeks.org/equals-hashcode-methods-java/
public class Vehicle {

    static final String SPEED_UNIT = "km/h";

    private String vin;
    private String brand;
    private int maxSpeed;

    public Vehicle(String vin, String brand, int maxSpeed) {
        this.vin = vin;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    String getDescription() {
        return "vin: " + vin + ", brand: " + brand +
                ", maxSpeed: " + maxSpeed + SPEED_UNIT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vin, vehicle.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}

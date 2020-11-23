package com.accenture.bootcamp.collections.examples.sets;

import java.util.Objects;

public class Car {

    private String vin;

    public Car(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}

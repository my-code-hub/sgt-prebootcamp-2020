package com.accenture.prebootcamp.objects.exercises.exercise4;

// 1. Create a class "Weapon" and:
public class Weapon {

    //these are constants that exist even if there is no instance for Weapon
    private static final int MIN_POWER = 1;
    private static final int MAX_POWER = 10;

    private static final int MIN_NAME_LENGTH = 4;
    private static final int MAX_NAME_LENGTH = 20;

    private static final int DEFAULT_POWER = 5;
    private static final String DEFAULT_NAME = "Axe";

    // a. Add properties (should be encapsulated as private):
    //     "power" (whole number)
    //     "name"  (text)
    private String name;
    private int power;

    // c. Add default constructor which initializes properties with default values
    //     (default power should be 3 and name - "Axe")
    public Weapon() {
        power = DEFAULT_POWER;
        name = DEFAULT_NAME;
    }

    // d. Add constructor with parameters "power" and "name" for setting properties of the weapon
    //    (this constructor should validate power value and shouldn't allow to set it less than 1
    //     or higher than 10. It should also validate name. If name has less than 4 characters or
    //     more than 20, it should be set to default ("Axe"))
    public Weapon(String name, int power) {
        //we are using ternary operator here
        this.power = power >= MIN_POWER && power <= MAX_POWER ? power : DEFAULT_POWER;
        if (name == null || name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            this.name = DEFAULT_NAME;
        } else {
            this.name = name;
        }
    }

    //b. Add getter methods for all of the properties in "Weapon" class
    public String getName() {
        return name;
    }

    //b. Add getter methods for all of the properties in "Weapon" class
    public int getPower() {
        return power;
    }
}

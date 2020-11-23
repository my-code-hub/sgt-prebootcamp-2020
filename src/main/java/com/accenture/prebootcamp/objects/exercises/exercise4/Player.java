package com.accenture.prebootcamp.objects.exercises.exercise4;

//Create a class "Player" and...
class Player {

    static final int INITIAL_HEALTH = 1000;

    // a. add property "name" (of type text)
    // b. add property "weapon" (of type Weapon)
    // c. add property "health" (whole number)
    private String name;
    private int health = INITIAL_HEALTH;
    private Weapon weapon;

    //e. add constructor which has two parameters for setting name and Weapon. Also in this
    //              constructor you should set health to 1000
    Player(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    //f. add getter method for "name" and "health" properties
    String getName() {
        return name;
    }

    int getHealth() {
        return health;
    }

    // i. add "attack" method with one parameter of type "Player" (this is the victim). This method
    //    is used so our player (the object on which we call the method) can attack another player
    //    (victim/the object which is the parameter).
    //    First, before we attack victim, we need to check if we are alive (if our player is alive).
    //    If our player is dead, then we just output message:
    //             "[name] is unable to attack, because he/she is dead."
    //    and return from method without attacking victim. But if we are alive, we have to
    //    take the power of our weapon and subtract it from the victims health (so we basically
    //    call "subtractHealth" method on our victim) and before that print message:
    //         "[attackerName] is attacking [victimName] with [weapon.name]"
    void attack(Player victim) {
        if (!isAlive()) {
            System.out.println(name + " is unable to attack, because player is dead.");
            return;
        }
        System.out.println(name + " is attacking " + victim.getName() + " with " + weapon.getName());
        victim.subtractHealth(weapon.getPower());
    }

    // h. create a method "subtractHealth" with parameter "points" (whole number).
    //     This method subtracts points from players health property and outputs message:
    //         "[name] lost [numberOfPoints] points and now has [health]] left."
    //     But, if points is greater than player's health it sets players health to zero and prints this
    //     message instead: "[name] just lost all points and died!".
    //     If this player is already dead already (has 0 or less health), then we don't need to subtract
    //     any points or output any message.
    private void subtractHealth(int points) {
        if (!isAlive()) {
            return;
        }
        health -= points;
        if (health <= 0) {
            health = 0;
            System.out.println(name + " just lost all points and died!");
        } else {
            System.out.println(name + " lost " + points + " points and now has " + health + " left.");
        }
    }

    //g. add method "isAlive" which returns true if user has health greater than 0, or false
    //              player's health is 0 or less. Access should be private.
    private boolean isAlive() {
        return health > 0;
    }
}

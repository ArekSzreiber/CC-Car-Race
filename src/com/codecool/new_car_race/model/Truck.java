package com.codecool.new_car_race.model;

import java.util.Random;

/**
 * speed: 100km/h. 5% chance of breaking down for 2 turns.
 * names: Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
 */
public class Truck extends Vehicle {
    private int breakdownTurnsLeft;// holds how long its still broken down.

    private void chanceOfBreakingDown() {
        Random random = new Random();
        int chanceToBreak = random.nextInt(100);
        if (chanceToBreak < 5) {
            breakdownTurnsLeft = 2;
        }
    }

    boolean isBroken() {
        return breakdownTurnsLeft > 0;
    }

    /**
     * I decided to break Truck at the end of the lap,
     * so it not possible for Truck to be broken for more than 2 laps in the row
     */
    public void moveForAnHour() {
        super.moveForAnHour();
        if (isBroken()) {
            repairing();
        } else {
            chanceOfBreakingDown();
        }
    }

    public void prepareForLap(Race race) {// setup the actual speed used for the current lap
        if (isBroken()) {
            currentSpeed = 0;
        } else {
            currentSpeed = normalSpeed;
        }
    }

    private void repairing() {
        if (isBroken()) {
            breakdownTurnsLeft--;
        }
    }

    public Truck() {
        Random randomGenerator = new Random();
        int truckNumber = randomGenerator.nextInt(1000) + 1;
        this.name = Integer.toString(truckNumber);
        normalSpeed = 100;
        breakdownTurnsLeft = 0;
    }
}

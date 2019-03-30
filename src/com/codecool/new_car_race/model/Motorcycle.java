package com.codecool.new_car_race.model;

import java.util.Random;

/**
 * speed: 100km/h. If it rains, travels with 5-50km/h slower (randomly).
 * names: "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
 */
public class Motorcycle extends Vehicle {
    private static int motorcyclesCounter = 0; // The number of instances created. Used for naming.

    public void prepareForLap(Race race) { // setup the actual speed used for the current lap
        currentSpeed = normalSpeed;
        if (race.isRaining()) {
            Random random = new Random();
            int slackening = random.nextInt(46) + 5;
            currentSpeed -= slackening;
        }
    }

    public Motorcycle() {
        motorcyclesCounter++;
        this.name = "Motorcycle " + motorcyclesCounter;
        this.normalSpeed = 100;
    }
}

package com.codecool.new_car_race.model;

import java.util.Random;

public class Truck extends Vehicle {
    //TODO Truck  5% chance of breaking down for 2 turns.
    //private int currentSpeed; // 0 if Truck is broken, else is equal to normalSpeed
    //private int normalSpeed; // always 100km/h
    //private String name;// Truck drivers call all their trucks a random number between 0 and 1000.
    private int breakdownTurnsLeft;// holds how long its still broken down.
    private Vehicle vehicle;
    //private int distanceTraveled;// holds the summarized distance traveled in the race.

    private void prepareForLap(Race race) {// setup the actual speed used for the current lap
        if(breakdownTurnsLeft > 0){
            currentSpeed = 0;
        } else {
            currentSpeed = normalSpeed;
        }
    }



    public Truck() {
        Random randomGenerator = new Random();
        int truckNumber = randomGenerator.nextInt(1000) + 1;
        this.name = Integer.toString(truckNumber);


    }
}

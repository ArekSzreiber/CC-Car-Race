package com.codecool.new_car_race.model;

public class Vehicle {
    protected int currentSpeed;
    protected int normalSpeed;
    protected int distanceTraveled;
    protected String name;

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }


    public void prepareForLap(Race race) {

    }

    /**
     * The vehicle travels for an hour.
     * It increases the distance traveled.
     * Call this from the Race::simulateRace() only!
     */
    public void moveForAnHour() {
        distanceTraveled += currentSpeed;
    }

    public static void main(String[] args) {
        System.out.println("Kurwa");
    }
}

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

    public int getDistanceTraveled() {
        return distanceTraveled;
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

    public int compareTo(Vehicle compared) {
        if (this.getDistanceTraveled() > compared.getDistanceTraveled()) {
            return -1;
        } else if (this.getDistanceTraveled() < compared.getDistanceTraveled()) {
            return 1;
        } else {
            return 0;
        }
    }
}

package com.codecool.new_car_race.model;

public abstract class Vehicle implements Comparable<Vehicle> {
    int currentSpeed;
    int normalSpeed;
    int distanceTraveled;
    String name;

    public String getName() {
        return name;
    }

    int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    abstract public void prepareForLap(Race race);

    /**
     * The vehicle travels for an hour.
     * It increases the distance traveled.
     * Call this from the Race::simulateRace() only!
     */
    public void moveForAnHour() {
        distanceTraveled += currentSpeed;
    }

    public int compareTo(Vehicle compared) {
        return compared.getDistanceTraveled() - this.getDistanceTraveled();
    }
}

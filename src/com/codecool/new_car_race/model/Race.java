package com.codecool.new_car_race.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Race {
    private Vehicle[] vehicles;
    private Weather weather;
    private final static int NUM_LAPS = 50;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    boolean isRaining() {
        return weather.isRaining();
    }

    Race(boolean isRaining) {
        weather = new Weather(isRaining);
    }

    public Race() {
        weather = new Weather();
    }

    boolean isAnyTruckBroken() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).isBroken()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void simulateRace() {
        for (int i = 0; i < NUM_LAPS; i++) {
            weather.setRaining();
            for (Vehicle vehicle : vehicles) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
        }
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void sortVehiclesByDistance() {
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>(Arrays.asList(vehicles));
        Collections.sort(vehicleArrayList);
        vehicles = vehicleArrayList.toArray(new Vehicle[vehicles.length]);
    }
}

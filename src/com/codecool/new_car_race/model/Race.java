package com.codecool.new_car_race.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private Vehicle[] vehicles;
    private Weather weather;
    public boolean isBrokenTruck;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public boolean isRaining() {
        return weather.isRaining();
    }

    Race(boolean isRaining) {
        weather = new Weather(isRaining);
    }

    public Race() {
        weather = new Weather();
    }

    public boolean isAnyTruckBroken() {
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
        for (int i = 0; i < 50; i++) {
            weather.setRaining();
            for (Vehicle vehicle : vehicles) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
        }
    }

    public void setBrokenTruck(boolean brokenTruck) {
        isBrokenTruck = brokenTruck;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void sortVehiclesByDistance() {
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>(Arrays.asList(vehicles));
        vehicleArrayList.sort(Vehicle::compareTo);
        vehicles = vehicleArrayList.toArray(new Vehicle[vehicles.length]);
    }
}

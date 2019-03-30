package com.codecool.new_car_race.model;

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
        return isBrokenTruck;
    }

    public void setBrokenTruck(boolean brokenTruck) {
        isBrokenTruck = brokenTruck;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
}

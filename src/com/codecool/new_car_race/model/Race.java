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
        for(Vehicle vehicle : vehicles){
            if(vehicle instanceof Truck){
                if(((Truck) vehicle).isBroken()){
                    return true;
                }
            }
        }
        return false;
    }

    }

    public void setBrokenTruck(boolean brokenTruck) {
        isBrokenTruck = brokenTruck;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
}

package com.codecool.new_car_race.model;

public class Race {
    //do dodania lista pojazdów
    private Weather weather;
    public boolean isBrokenTruck;

    public boolean isRaining(){
        return weather.isRaining();
    }

    Race(boolean isRaining){
        weather = new Weather(isRaining);
    }

    Race(){
        weather = new Weather();
    }

    public boolean isAnyTruckBroken(){
        return isBrokenTruck;
    }

    public void setBrokenTruck(boolean brokenTruck) {
        isBrokenTruck = brokenTruck;
    }
}

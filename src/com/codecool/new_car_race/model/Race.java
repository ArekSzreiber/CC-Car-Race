package com.codecool.new_car_race.model;

public class Race {
    //do dodania lista pojazdów
    private Weather weather;

    public boolean isRaining(){
        return weather.isRaining();
    }

    Race(boolean isRaining){
        weather = new Weather(isRaining);
    }

    Race(){
        weather = new Weather();
    }

}

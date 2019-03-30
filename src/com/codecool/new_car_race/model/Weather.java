package com.codecool.new_car_race.model;

import java.util.Random;


public class Weather {
    private boolean rain;

    /**
     * 30% chance of rain
     */
    public void setRaining() {
        Random randomGenerator = new Random();
        rain = randomGenerator.nextInt(10) < 3;
    }

    /**
     * @return true if it rains, false otherwise
     */
    public boolean isRaining() {
        return rain;
    }

    /**
     * Sets weather with default 30% chance to rain
     */
    public Weather() {
        setRaining();
    }

    /**
     * Sets weather with @param rain equal to passed argument
     * Creates Weather with rain property equal to the argument isRaining
     *
     * @param isRaining
     */
    public Weather(boolean isRaining) {
        this.rain = isRaining;
    }

}

package com.codecool.new_car_race.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WeatherTest {
    @Test
    void testRainChance() {
        Weather weather = new Weather();
        int counter = 0;
        int nrOfTests = 1000;
        for (int i = 0; i < nrOfTests; i++) {
            weather.setRaining();
            if (weather.isRaining()) {
                counter++;
            }
        }
        double rainRatio = (double) counter / nrOfTests;
        assertTrue(0.2 <= rainRatio && rainRatio <= 0.4);
    }
}
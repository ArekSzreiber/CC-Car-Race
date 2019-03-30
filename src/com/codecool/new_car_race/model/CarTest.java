package com.codecool.new_car_race.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testCreatingNames() {
        Vehicle car;
        for (int i = 0; i < 10; i++) {
            car = new Car();
            System.out.println(car.getName());
        }
    }

    @Test
    void testPreparationWithoutBrokenTruck() {
        Vehicle car;
        Race race = new Race();
        race.setBrokenTruck(false);
        car = new Car();
        car.prepareForLap(race);
        int maxSpeed = car.getCurrentSpeed();
        int minSpeed = car.getCurrentSpeed();
        for (int i = 0; i < 1000; i++) {
            car = new Car();
            car.prepareForLap(race);
            if (car.getCurrentSpeed() > maxSpeed) {
                maxSpeed = car.getCurrentSpeed();
            }
            if (car.getCurrentSpeed() < minSpeed) {
                minSpeed = car.getCurrentSpeed();
            }
            assertTrue(car.getCurrentSpeed() >= 80 && car.getCurrentSpeed() <= 110);
        }
        System.out.println("Normal speed max roll: " + maxSpeed);
        System.out.println("Normal speed min roll: " + minSpeed);
    }

    @Test
    void testPreparationWithBrokenTruck() {
        Vehicle car;
        Race race = new Race();
        race.setBrokenTruck(true);
        car = new Car();
        car.prepareForLap(race);
        assertEquals(75, car.getCurrentSpeed());
    }

}
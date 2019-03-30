package com.codecool.new_car_race.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TruckTest {
    @Test
    void testNaming() {
        Truck truck;
        int truckNumber;
        for (int i = 0; i < 1000; i++) {
            truck = new Truck();
            truckNumber = Integer.parseInt(truck.getName());
            assertTrue(truckNumber >= 0 && truckNumber <= 1000);
        }
    }

    @Test
    void testPreparationIfIsRoadworthy() {
        Truck truck = new Truck();
        Race race = new Race();
        int brokenCounter = 0;
        int numberOfTests = 100;
        for (int i = 0; i < numberOfTests; i++) {
            truck.prepareForLap(race);
            if (truck.isBroken()) {
                brokenCounter++;
                assertEquals(0, truck.getCurrentSpeed());
            } else {
                assertEquals(100, truck.getCurrentSpeed());
            }
            truck.moveForAnHour();
        }
        System.out.println("Truck broken ratio: " + (double) brokenCounter / numberOfTests);
    }

}
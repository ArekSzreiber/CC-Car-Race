package com.codecool.new_car_race.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}
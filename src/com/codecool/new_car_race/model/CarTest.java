package com.codecool.new_car_race.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {
    @Test
    void testCreatingNames() {
        Vehicle car;
        for (int i = 0; i < 10; i++) {
            car = new Car();
            System.out.println(car.getName());
        }
    }



}
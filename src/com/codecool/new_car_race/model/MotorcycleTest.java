package com.codecool.new_car_race.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {
    @Test
    void testNaming(){
        for (int i = 1; i <= 10; i++) {
            Vehicle motor = new Motorcycle();
            assertEquals("Motorcycle "+i, motor.getName());
        }
    }
/*
    @Test
    void testRidingInRain(){
        Race race = new Race(true);
        for (int i = 0; i < 10; i++) {
            Motorcycle motor = new Motorcycle();
            motor.prepareForLap(race);
            motor.moveForAnHour();
            System.out.println(motor.getCurrentSpeed());
            //assertTrue(motor.getCurrentSpeed() >= 50 && motor.getCurrentSpeed() <=100);
        }
    }*/
}
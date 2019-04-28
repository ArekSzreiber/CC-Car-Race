package com.codecool.new_car_race.controller;


import com.codecool.new_car_race.model.*;
import com.codecool.new_car_race.view.View;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        int amountInType = 10;
        Vehicle[] vehicles = new Vehicle[3 * amountInType];
        int j = 0;
        for (int i = 0; i < amountInType; i++) {
            vehicles[j++] = new Car();
        }
        for (int i = 0; i < amountInType; i++) {
            vehicles[j++] = new Motorcycle();
        }
        for (int i = 0; i < amountInType; i++) {
            vehicles[j++] = new Truck();
        }
        race.setVehicles(vehicles);
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);
        race.simulateRace();
        race.sortVehiclesByDistance();
        View.printRaceResults(race);
    }
}

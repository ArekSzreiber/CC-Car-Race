package com.codecool.new_car_race.view;

import com.codecool.new_car_race.model.Race;
import com.codecool.new_car_race.model.Vehicle;

public class View {
    public static void showVehiclesNames(Race race) {
        Vehicle[] vehicles = race.getVehicles();
        int i = 1;
        for (Vehicle vehicle : vehicles) {
            System.out.println(i++ + ". " + vehicle.getName());
        }
    }
}

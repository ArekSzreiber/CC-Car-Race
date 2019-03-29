package com.codecool.new_car_race.model;

import java.util.stream.Stream;
import java.util.Random;


public class Car extends Vehicle {
    //TODO If there is a broken down Truck on the track, then limit the max speed of cars to 75 km/h.
    //private int currentSpeed; // equal to normalSpeed if there are no broken trucks, 75km/h otherwise
    //private int normalSpeed;// the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
    //private int distanceTraveled; // holds the summarized distance traveled in the race.
    //A list from the words here: http://www.fantasynamegenerators.com/car-names.php
    private static final String[] nameComponents = Stream.of(
            "Dynamique",
            "Éclat",
            "Évasion",
            "Puissance",
            "Zénith",
            "Énigme",
            "Façon",
            "Tradition",
            "Onyx",
            "Grandeur").toArray(String[]::new);

    private void prepareForLap(Race race) { // setup the actual speed used for the current lap

    }



    /**
     * @return String, 2 different, randomly chosen words form nameComponents separated with space
     */
    private String composeName(){
        Random random = new Random();
        int firstIndex = random.nextInt(nameComponents.length);
        int secondIndex = firstIndex;
        while (firstIndex == secondIndex){
            secondIndex = random.nextInt(nameComponents.length);
        }
        return nameComponents[firstIndex] + " " + nameComponents[secondIndex];

    }

    public Car() {
        name = composeName();
    }
}

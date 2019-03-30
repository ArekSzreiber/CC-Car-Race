package com.codecool.new_car_race.model;

import java.util.stream.Stream;
import java.util.Random;

/**
 * speed: set randomly between 80 - 110 km/h.
 * If there is a broken down Truck, speed for Car is limit to 75km/h.
 * names: two words from http://www.fantasynamegenerators.com/car-names.php
 */
public class Car extends Vehicle {
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

    public void prepareForLap(Race race) { // setup the actual speed used for the current lap
        if(race.isAnyTruckBroken()){
            currentSpeed = 75;
        }else{
            currentSpeed = normalSpeed;
        }
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
        Random random = new Random();
        this.normalSpeed = random.nextInt(31) + 80;
    }
}

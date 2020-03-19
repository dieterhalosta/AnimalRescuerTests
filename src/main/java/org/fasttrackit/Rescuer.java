package org.fasttrackit;

public class Rescuer extends Human {
    double budget;


    public Rescuer(String name) {
        super(name);
    }

    public void feeding (Animal animal, Food food) {
        System.out.println("-----------------------------------------------------------------------");
        if (food.getName().equals(animal.getFavoriteFood())) {
            System.out.println(getName() + " just feed some " + food.getName() + " to " + animal.name + "!");
            animal.hungerLevel-=2;
            System.out.println(animal.name + "s hunger level is now: " + animal.hungerLevel + ";");
            animal.happinessLevel++;
            System.out.println(animal.name + "s health level is now: " + animal.healthLevel + ";");
            animal.happinessLevel++;
            System.out.println(animal.name + "s happiness level is now: " + animal.happinessLevel + ";");
        }

        System.out.println(getName() + " just feed some " + food.getName() + " to " + animal.name + "!");
        animal.hungerLevel--;
        System.out.println(animal.name + "s hunger level is now: " + animal.hungerLevel + ";");
        animal.healthLevel++;
        System.out.println(animal.name + "s health level is now: " + animal.healthLevel + ";");

    }

    public void playing (Animal animal, PlayTime playTime) {
        System.out.println("------------------------------------------------------------------------------");
        if (playTime.getName().equals(animal.favoriteActivity)) {
            System.out.println(getName() + " just played some " + playTime.getName() + " with " + animal.name + "!");
            animal.happinessLevel+=2;
            System.out.println(animal.name + "s happiness level is now: " + animal.happinessLevel + ";" );
            animal.hungerLevel++;
            System.out.println(animal.name + "s hunger level is now: " + animal.hungerLevel + ";" );
        }
            System.out.println(getName() + " just played some " + playTime.getName() + " with " + animal.name + "!");
            animal.happinessLevel++;
            System.out.println(animal.name + "s happiness level is now: " + animal.happinessLevel + ";" );


    }

}

package org.fasttrackit;

import java.time.LocalDate;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("----------------------------------");
        System.out.println( "Welcome to the AnimalRescuer!" );
        System.out.println("----------------------------------");

        Rescuer rescuer = new Rescuer("Adi");
        rescuer.budget = 300.12;
        rescuer.age = 22;
        rescuer.gender = "Male";


        Food food1 = new Food ("Meat");
        food1.price = 22.1;
        food1.availability = true;
        food1.quantity = 2.5;
        food1.company = "Petry";
        food1.origin = "Cluj";
        food1.premium = false;
        food1.expirationDate = LocalDate.of(2022, 2, 10);

        Food food2 = new Food ("Purina");
        food2.price = 10.2;
        food2.availability = true;
        food2.quantity = 4.5;
        food2.company = "Mars";
        food2.origin = "Poland";
        food2.premium = false;
        food2.expirationDate = LocalDate.of(2021, 2, 10);

        PlayTime playTime1 = new PlayTime("Fetch");
        playTime1.duration = 2.2;

        PlayTime playTime2 = new PlayTime("Scratch");
        playTime2.duration = 1.2;

        Animal animal = new Animal("Meat");
        animal.name = "Apple";
        animal.age = 3;
        animal.healthLevel = 2;
        animal.hungerLevel = 10;
        animal.happinessLevel = 2;
        animal.favoriteActivity = "Fetch";

        Vet vet1 = new Vet("Geo");

        vet1.specialization = "Dogs";
        vet1.price = 80.2;
        vet1.availability = true;
        vet1.age = 45;
        vet1.experience = 20;

        Game game1 = new Game();
        game1.animal = animal;
        game1.rescuer = rescuer;
        game1.vet = vet1;
        System.out.println("Name of player is: " + rescuer.getName());
        System.out.println("Name of Vet is: " + vet1.getName());
        //rescuer.feeding(animal, food1);
        //rescuer.playing(animal, playTime1);
        rescuer.feeding(animal, food2);
        //rescuer.playing(animal, playTime2);
    }
}

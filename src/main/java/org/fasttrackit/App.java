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
        rescuer.setAge(22);
        rescuer.setGender("Male");

        Work coder = new Work();
        coder.setName("Programator");
        coder.setDuration(7.5);
        coder.setPlace("NTT");
        coder.setSalary(8000);

        Food food1 = new Food ("Meat");
        food1.setPrice(22.1);
        food1.setAvailability(true);
        food1.setQuantity(2.5);
        food1.setCompany("Petry");
        food1.setOrigin("Cluj");
        food1.setPremium(true);
        food1.setExpirationDate(LocalDate.of(2021, 4, 10));

        Food food2 = new Food ("Purina");
        food2.setPrice(12.1);
        food2.setAvailability(true);
        food2.setQuantity(1.5);
        food2.setCompany("Mars");
        food2.setOrigin("Poland");
        food2.setPremium(false);
        food1.setExpirationDate(LocalDate.of(2020, 8, 10));

        PlayTime playTime1 = new PlayTime();
        playTime1.setName("Fetch");
        playTime1.setDuration(2.2);

        PlayTime playTime2 = new PlayTime();
        playTime2.setName("Scratch");
        playTime2.setDuration(0.5);

        Dog dog = new Dog("Apple");
        dog.setAge(3);
        dog.setHealthLevel(2);
        dog.setHungerLevel(10);
        dog.setHappinessLevel(1);
        dog.setFavoriteFood("Meat");
        dog.setFavoriteActivity("Fetch");

        Vet vet1 = new Vet("Geo");
        vet1.setSpecialization("Dogs");
        vet1.setAvailability(true);
        vet1.setPrice(80.2);
        vet1.setAge(45);
        vet1.setExperience(20);

        Game game1 = new Game();
        game1.animal = dog;
        game1.rescuer = rescuer;
        game1.vet = vet1;
        System.out.println("Rescuer name is: " + rescuer.getName());
        System.out.println("Vet name is: " + vet1.getName());
        System.out.println("Animal food is: " + food1.getName());
        rescuer.feeding(dog,food1);
        rescuer.playing(dog,playTime1);
        //rescuer.feeding(dog,food2);
        //rescuer.playing(dog,playTime2);
    }
}

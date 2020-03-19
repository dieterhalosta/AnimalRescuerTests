package org.fasttrackit;

public class Animal {
    String name;
    int age;
    int healthLevel;
    int hungerLevel;
    int happinessLevel;
    String favoriteFood;
    String favoriteActivity;

    public Animal(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }


    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }


}

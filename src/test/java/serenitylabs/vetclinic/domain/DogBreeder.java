package serenitylabs.vetclinic.domain;

import serenitylab.domain.vetclinic.Dog;

import java.time.LocalDate;

public class DogBreeder implements WithBreed, WithColor {
    private String name;
    private String breed;
    private String color;
    private String favouriteFood;
    private String favouriteToy;

    public static DogBreeder aDog() {
        return new DogBreeder();
    }

    public static DogBreeder aLargeDog() {
        return aDog().ofBreed("Labrador");
    }

    public static DogBreeder aSmallDog() {
        return aDog().ofBreed("Poodle");
    }

    public static DogBreeder aGuardDog() {
        return aDog().ofBreed("Rottweiler");
    }

    public  DogBreeder called(String name) {
        this.name = name;
        return this;
    }

    public DogBreeder ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogBreeder ofColour(String color) {
        this.color = color;
        return this;
    }


    public Dog bornOn(LocalDate dateOfBirth) {
        return new Dog(name, breed, color, favouriteFood, favouriteToy, dateOfBirth);
    }

    public WithColor withFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }
    //@Override
    public WithColor withFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
        return this;
    }

}

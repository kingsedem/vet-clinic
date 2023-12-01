package serenitylab.domain.vetclinic;

import java.time.LocalDate;


public class Dog {
    private final String name;
    private final String breed;
    private final LocalDate dateOfBirth;
    private final String color;
    private final String favouriteFood;

    private  final String favouriteToy;

    public Dog(String name, String breed, String color, String favouriteFood, String favouriteToy, LocalDate dateOfBirth) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.favouriteFood = favouriteFood;
        this.favouriteToy = favouriteToy;
        this.dateOfBirth = dateOfBirth;

    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

//    public static WithBreed called(String name) {
//        return new DogBreeder(name);
//    }


    public String getBreed() {
        return breed;
    }


    public String getColor() {
        return color;
    }

    public String  getFavouriteFood() {
        return favouriteFood;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }


//    interface WithBreed{
//        WithColor ofBreed(String breed);
//    }

//    interface WithColor{
//        DogBreeder ofColour(String color);
//
//        Dog bornOn(LocalDate theFourthOfJuly);
//    }

//    public static class DogBreeder implements WithBreed, WithColor{
//        private String name;
//        private String breed;
//        private String color;
//        private String favouriteFood;
//        private String favouriteToy;
//
//        public DogBreeder(String name) {
//            this.name = name;
//        }
//
//        public WithColor ofBreed(String breed) {
//            this.breed = breed;
//            return this;
//        }
//
//        public DogBreeder ofColour(String color) {
//            this.color = color;
//            return this;
//        }
//
//
//        public Dog bornOn(LocalDate dateOfBirth) {
//            return new Dog(name, breed, color, favouriteFood, favouriteToy, dateOfBirth);
//        }
//
//        public WithColor withFavouriteFood(String favouriteFood) {
//            this.favouriteFood = favouriteFood;
//            return this;
//        }
//        //@Override
//        public WithColor withFavouriteToy(String favouriteToy) {
//            this.favouriteToy = favouriteToy;
//            return this;
//        }
//
//    }

}


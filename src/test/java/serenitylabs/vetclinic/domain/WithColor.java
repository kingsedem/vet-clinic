package serenitylabs.vetclinic.domain;

import serenitylab.domain.vetclinic.Dog;

import java.time.LocalDate;

    interface WithColor{
        DogBreeder ofColour(String color);

        Dog bornOn(LocalDate theFourthOfJuly);
    }


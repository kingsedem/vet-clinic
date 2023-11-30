package serenitylabs.vetclinic.domain;

import org.junit.Test;
import serenitylab.domain.vetclinic.Dog;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;




public class WhenWeCreateANewDog {
    private static final LocalDate THE_FOURTH_OF_JULY = LocalDate.of(1993, 07, 04);
    @Test
    public void a_new_dog_should_have_a_name_a_breed_a_color_and_a_date_of_birth(){
        Dog fido = DogBreeder.aLargeDog()
                 .called("Fido") //Mandatory
                .ofBreed("Labrador")  //Mandatory
                .ofColour("black")  // Optional
                .bornOn(THE_FOURTH_OF_JULY);  //Mandatory

        assertThat(fido.getName()).isEqualTo("Fido");
        assertThat(fido.getBreed()).isEqualTo("Labrador");
        assertThat(fido.getColor()).isEqualTo("black");
        assertThat(fido.getDateOfBirth()).isEqualTo(THE_FOURTH_OF_JULY);
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_food(){
        Dog fido = DogBreeder.aSmallDog()
                .called("Spot") //Mandatory
                .ofBreed("Poodle")   //Mandatory
                .ofColour("black")  // Mandatory
                .withFavouriteFood("Waffles") //Optional field
                .bornOn(THE_FOURTH_OF_JULY);  //Mandatory

        assertThat(fido.getName()).isEqualTo("Spot");
        assertThat(fido.getBreed()).isEqualTo("Poodle");
        assertThat(fido.getColor()).isEqualTo("black");
        assertThat(fido.getFavouriteFood()).isEqualTo("Waffles");
        assertThat(fido.getDateOfBirth()).isEqualTo(THE_FOURTH_OF_JULY);
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy(){
        Dog fido = DogBreeder.aGuardDog()
                .called("Bingo") //Mandatory
                .ofBreed("Labrador")   //Mandatory
                .ofColour("black")  // Mandatory
                .withFavouriteToy("Tire Biter")//Optional field
                .bornOn(THE_FOURTH_OF_JULY);  //Mandatory

        assertThat(fido.getName()).isEqualTo("Bingo");
        assertThat(fido.getBreed()).isEqualTo("Labrador");
        assertThat(fido.getColor()).isEqualTo("black");
        assertThat(fido.getFavouriteToy()).isEqualTo("Tire Biter");
        assertThat(fido.getDateOfBirth()).isEqualTo(THE_FOURTH_OF_JULY);
    }
}

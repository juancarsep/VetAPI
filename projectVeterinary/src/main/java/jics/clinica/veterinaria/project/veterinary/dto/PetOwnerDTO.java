package jics.clinica.veterinaria.project.veterinary.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PetOwnerDTO {

    private String pet_name;
    private String species;
    private String breed;
    private String owner_name;
    private String owner_lastname;

    public PetOwnerDTO() {
    }

    public PetOwnerDTO(String pet_name, String species, String breed, String owner_name, String owner_lastname) {
        this.pet_name = pet_name;
        this.species = species;
        this.breed = breed;
        this.owner_name = owner_name;
        this.owner_lastname = owner_lastname;
    }
}

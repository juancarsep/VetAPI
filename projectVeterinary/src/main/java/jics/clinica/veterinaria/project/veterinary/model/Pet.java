package jics.clinica.veterinaria.project.veterinary.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long pet_id;
    private String name;
    private String species;
    private String breed;
    private String color;
    @OneToOne
    @JoinColumn(name="owner_id", referencedColumnName = "owner_id")
    private Owner owner;

    public Pet() {
    }

    public Pet(Long pet_id, String name, String species, String breed, String color) {
        this.pet_id = pet_id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.color = color;
    }
}

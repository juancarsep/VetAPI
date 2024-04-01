package jics.clinica.veterinaria.project.veterinary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long owner_id;
    private String dni;
    private String name;
    private String lastname;
    private String mobileNumber;

    public Owner() {
    }

    public Owner(Long owner_id, String dni, String name, String lastname, String mobileNumber) {
        this.owner_id = owner_id;
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.mobileNumber = mobileNumber;
    }
}

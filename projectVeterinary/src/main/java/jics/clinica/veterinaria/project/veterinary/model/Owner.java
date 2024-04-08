package jics.clinica.veterinaria.project.veterinary.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Pet> pets;

    public Owner() {
    }

    public Owner(Long owner_id, String dni, String name, String lastname, String mobileNumber) {
        this.owner_id = owner_id;
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "owner_id=" + owner_id +
                ", dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", pets=" + pets +
                '}';
    }
}

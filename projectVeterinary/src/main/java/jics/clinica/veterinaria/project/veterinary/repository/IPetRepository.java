package jics.clinica.veterinaria.project.veterinary.repository;

import jics.clinica.veterinaria.project.veterinary.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPetRepository extends JpaRepository<Pet, Long> {
}

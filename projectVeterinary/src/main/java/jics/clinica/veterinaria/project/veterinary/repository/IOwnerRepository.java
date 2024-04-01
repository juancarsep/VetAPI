package jics.clinica.veterinaria.project.veterinary.repository;

import jics.clinica.veterinaria.project.veterinary.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOwnerRepository extends JpaRepository<Owner, Long> {
}

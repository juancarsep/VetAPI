package jics.clinica.veterinaria.project.veterinary.service;

import jics.clinica.veterinaria.project.veterinary.dto.PetOwnerDTO;
import jics.clinica.veterinaria.project.veterinary.model.Pet;

import java.util.ArrayList;
import java.util.List;

public interface IPetService {
    public void createPet(Pet pet);

    public Pet getPetById(Long id);

    public List<Pet> getAllPets();

    public Pet editPet(Long id, String name, String species, String breed, String color);

    public void deletePet(Long id);

    public List<Pet> getCaniches();

    public List<PetOwnerDTO> petsAndOwners();
}

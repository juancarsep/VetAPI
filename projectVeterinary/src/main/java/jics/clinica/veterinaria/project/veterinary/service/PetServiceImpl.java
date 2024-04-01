package jics.clinica.veterinaria.project.veterinary.service;

import jics.clinica.veterinaria.project.veterinary.dto.PetOwnerDTO;
import jics.clinica.veterinaria.project.veterinary.model.Pet;
import jics.clinica.veterinaria.project.veterinary.repository.IPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetServiceImpl implements IPetService{

    @Autowired
    IPetRepository petRepo;
    @Override
    public void createPet(Pet pet) {
        petRepo.save(pet);
    }

    @Override
    public Pet getPetById(Long id) {
        return petRepo.findById(id).orElse(null);
    }

    @Override
    public List<Pet> getAllPets() {
        return petRepo.findAll();
    }

    @Override
    public Pet editPet(Long id, String name, String species, String breed, String color) {
        Pet pet = this.getPetById(id);
        if(pet != null){
            pet.setName(name);
            pet.setSpecies(species);
            pet.setBreed(breed);
            pet.setColor(color);
            this.createPet(pet);
        }

        return pet;
    }

    @Override
    public void deletePet(Long id) {
        petRepo.deleteById(id);
    }

    @Override
    public List<Pet> getCaniches(){
        List<Pet> allPets = this.getAllPets();
        List<Pet> caniches = new ArrayList<>();
        String breed = "caniche";
        String species = "dog";

        for(Pet pet : allPets){
            if(pet.getSpecies().equalsIgnoreCase(species) && pet.getBreed().equalsIgnoreCase(breed)){
                caniches.add(pet);
            }
        }
        return caniches;
    }

    @Override
    public List<PetOwnerDTO> petsAndOwners() {
        List<Pet> allPets = this.getAllPets();
        List<PetOwnerDTO> petsAndOwnersList = new ArrayList<>();
        PetOwnerDTO petOwnDTO = new PetOwnerDTO();
        for(Pet pet : allPets){
            petOwnDTO.setPet_name(pet.getName());
            petOwnDTO.setSpecies(pet.getSpecies());
            petOwnDTO.setBreed(pet.getBreed());
            petOwnDTO.setOwner_name(pet.getOwner().getName());
            petOwnDTO.setOwner_lastname(pet.getOwner().getLastname());
            petsAndOwnersList.add(petOwnDTO);

            petOwnDTO = new PetOwnerDTO();
        }
        return petsAndOwnersList;
    }
}

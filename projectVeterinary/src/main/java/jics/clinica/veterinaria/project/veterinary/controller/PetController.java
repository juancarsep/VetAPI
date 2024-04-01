package jics.clinica.veterinaria.project.veterinary.controller;

import jics.clinica.veterinaria.project.veterinary.dto.PetOwnerDTO;
import jics.clinica.veterinaria.project.veterinary.model.Owner;
import jics.clinica.veterinaria.project.veterinary.model.Pet;
import jics.clinica.veterinaria.project.veterinary.service.IPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PetController {
    @Autowired
    IPetService petService;

    @GetMapping("/pets/get")
    public List<Pet> getAllPets(){
        return petService.getAllPets();
    }

    @GetMapping("/pets/get/{id}")
    public Pet getPetById(@PathVariable Long id){
        return petService.getPetById(id);
    }

    @PostMapping("/pets/create")
    public String createNewPet(@RequestBody Pet pet){
        petService.createPet(pet);
        return "Pet successfully created";
    }

    @PutMapping("/pets/edit/{id}")
    public Pet editPet(@PathVariable Long id,
                       @RequestParam(required = false, name = "name") String newName,
                       @RequestParam(required = false, name = "species") String newSpecies,
                       @RequestParam(required = false, name = "breed") String newBreed,
                       @RequestParam(required = false, name = "color") String newColor){
        return petService.editPet(id, newName, newSpecies, newBreed, newColor);
    }

    @DeleteMapping("/pets/delete/{id}")
    public String deletePet(@PathVariable Long id){
        petService.deletePet(id);

        return "Pet successfully deleted";
    }

    @GetMapping("pets/dogs/caniches")
    public List<Pet> getAllCanicheDogs(){
        return petService.getCaniches();
    }

    @GetMapping("pets/get/owners-pets-info")
    public List<PetOwnerDTO> list (){
        return petService.petsAndOwners();
    }
}

package jics.clinica.veterinaria.project.veterinary.controller;

import jics.clinica.veterinaria.project.veterinary.model.Owner;
import jics.clinica.veterinaria.project.veterinary.service.IOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OwnerController {

    @Autowired
    IOwnerService ownerService;

    @GetMapping("/owners/get")
    public List<Owner> getAllOwners(){
        return ownerService.getAllOwners();
    }

    @GetMapping("/owners/get/{id}")
    public Owner getOwnerById(@PathVariable Long id){
        return ownerService.getOwnerById(id);
    }

    @PostMapping("/owners/create")
    public String createOwner(@RequestBody Owner owner){
        ownerService.createOwner(owner);
        return "Owner successfully created";
    }

    @PutMapping("/owners/edit/{id}")
    public Owner editOwner(@PathVariable Long id,
                           @RequestParam(required = false, name = "dni") String newDni,
                           @RequestParam(required = false, name = "name") String newName,
                           @RequestParam(required = false, name = "lastname") String newLastname,
                           @RequestParam(required = false, name = "mobile") String newMobile){
        return ownerService.editOwner(id, newDni, newName, newLastname, newMobile);
    }

    @DeleteMapping("/owners/delete/{id}")
    public String deleteOwner(@PathVariable Long id){
        ownerService.deleteOwner(id);
        return "Owner successfully deleted";
    }
}

package jics.clinica.veterinaria.project.veterinary.service;

import jics.clinica.veterinaria.project.veterinary.model.Owner;

import java.util.List;

public interface IOwnerService {
    public void createOwner(Owner owner);

    public Owner getOwnerById(Long id);

    public List<Owner> getAllOwners();

    public Owner editOwner(Long id, String dni, String name, String lastname, String mobileNumber);

    public void deleteOwner(Long id);
}

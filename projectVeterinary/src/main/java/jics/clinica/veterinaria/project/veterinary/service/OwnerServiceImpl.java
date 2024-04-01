package jics.clinica.veterinaria.project.veterinary.service;

import jics.clinica.veterinaria.project.veterinary.model.Owner;
import jics.clinica.veterinaria.project.veterinary.repository.IOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements IOwnerService{

    @Autowired
    IOwnerRepository ownerRepo;
    @Override
    public void createOwner(Owner owner) {
        ownerRepo.save(owner);
    }

    @Override
    public Owner getOwnerById(Long id) {
        return ownerRepo.findById(id).orElse(null);
    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepo.findAll();
    }

    @Override
    public Owner editOwner(Long id, String dni, String name, String lastname, String mobileNumber) {
        Owner owner = this.getOwnerById(id);
        if(owner != null){
            owner.setDni(dni);
            owner.setName(name);
            owner.setLastname(lastname);
            owner.setMobileNumber(mobileNumber);
            ownerRepo.save(owner);
        }

        return owner;
    }

    @Override
    public void deleteOwner(Long id) {
        ownerRepo.deleteById(id);
    }
}

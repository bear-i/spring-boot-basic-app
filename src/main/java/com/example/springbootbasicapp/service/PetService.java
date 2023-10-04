package com.example.springbootbasicapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootbasicapp.entity.Pet;
import com.example.springbootbasicapp.repository.PetRepository;


@Service
public class PetService {
	private final PetRepository petRepository;

	@Autowired
	public PetService(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	public List<Pet> getAllPets() {
		return petRepository.findAll();
	}

	public Optional<Pet> getPetById(Long id) {
		return petRepository.findById(id);
	}

	public Pet createPet(Pet pet) {
		return petRepository.save(pet);
	}

	public Pet updatePet(Pet pet) {
		return petRepository.save(pet);
	}

	public void deletePet(Long id) {
		petRepository.deleteById(id);
	}
}

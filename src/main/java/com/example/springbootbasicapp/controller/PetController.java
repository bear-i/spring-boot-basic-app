package com.example.springbootbasicapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbasicapp.entity.Pet;
import com.example.springbootbasicapp.exception.ResourceNotFoundException;
import com.example.springbootbasicapp.service.PetService;


@RestController
@RequestMapping("/api/pets")
public class PetController {
	private final PetService petService;

	@Autowired
	public PetController(PetService petService) {
		this.petService = petService;
	}

	@GetMapping
	public List<Pet> getAllPets() {
		return petService.getAllPets();
	}

	@GetMapping("/{id}")
	public Pet getPetById(@PathVariable Long id) {
		return petService.getPetById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Pet not found with id: " + id));
	}
}

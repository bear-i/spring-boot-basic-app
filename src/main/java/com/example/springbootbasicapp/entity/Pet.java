package com.example.springbootbasicapp.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String species;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Pet pet = (Pet) o;
		return Objects.equals(id, pet.id) && Objects.equals(name, pet.name) && Objects.equals(species, pet.species) && Objects.equals(user, pet.user);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, species, user);
	}

	@Override
	public String toString() {
		return "Pet{" +
				"name='" + name + '\'' +
				", species='" + species + '\'' +
				", user=" + user +
				'}';
	}
}

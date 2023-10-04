package com.example.springbootbasicapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootbasicapp.entity.Pet;


@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

}

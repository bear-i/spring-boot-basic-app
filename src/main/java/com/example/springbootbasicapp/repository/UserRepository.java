package com.example.springbootbasicapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootbasicapp.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

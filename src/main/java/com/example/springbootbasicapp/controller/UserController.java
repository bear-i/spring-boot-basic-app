package com.example.springbootbasicapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbasicapp.entity.User;
import com.example.springbootbasicapp.exception.ResourceNotFoundException;
import com.example.springbootbasicapp.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
	}
}

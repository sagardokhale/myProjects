package com.example.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.domain.User;
import com.example.practice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping
	public void createUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@PutMapping
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	@GetMapping(value="/{userId}")
	public ResponseEntity<User> getUser(@PathVariable int userId) {
		return new ResponseEntity<User>(userService.getUser(userId), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{userId}")
	public void deleteUser(@PathVariable int userId)
	{
		userService.deleteUser(userId);
		
	}
	
	}

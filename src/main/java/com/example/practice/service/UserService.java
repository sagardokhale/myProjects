package com.example.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.domain.User;
import com.example.practice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public void addUser(User user) {
		userRepository.addUser(user);
	}
	
	public void updateUser(User user) {
		userRepository.updateUser(user);
	}
	
	public User getUser(int userId) {
		return userRepository.getUser(userId);
	}
	
	public void deleteUser(int userId) {
		userRepository.deleteUser(userId);
	}
}

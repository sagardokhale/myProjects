package com.example.practice.repository;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Repository;

import com.example.practice.domain.User;

@Repository
public class UserRepository {
	
	public static AtomicInteger counter=new AtomicInteger(0);
	
	public  HashMap<Integer,User> userList=new HashMap<>();
	
	public void addUser(User user) {
		userList.put(counter.incrementAndGet(), user);
		System.out.println(userList);
	}
	
	public void updateUser(User user) {
		userList.put(user.getUserId(),user);
	}
	
	public User getUser(int userId) {
		return userList.get(userId);
	}
	
	public void deleteUser(int userId) {
		userList.remove(userId);
	}
}

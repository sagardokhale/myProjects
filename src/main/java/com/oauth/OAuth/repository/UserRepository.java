package com.oauth.OAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oauth.OAuth.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}

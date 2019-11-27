package com.soumya.spring_security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soumya.spring_security.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String username);
}

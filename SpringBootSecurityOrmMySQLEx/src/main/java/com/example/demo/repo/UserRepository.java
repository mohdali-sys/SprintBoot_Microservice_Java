package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("SELECT usr FROM User usr WHERE usr.email=:email")
	Optional<User> findByEmail(String email);
}
package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository repo;

	public Integer saveUser(User user) {
		return repo.save(user).getId();
	}

	public Optional<User> findUserByEmail(String email) {
		return repo.findByEmail(email);
	}

}

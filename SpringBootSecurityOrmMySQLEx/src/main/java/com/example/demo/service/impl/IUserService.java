package com.example.demo.service.impl;

import java.util.Optional;

import com.example.demo.entity.User;

public interface IUserService {

	Integer saveUser(User user);

	Optional<User> findUserByEmail(String email);

}

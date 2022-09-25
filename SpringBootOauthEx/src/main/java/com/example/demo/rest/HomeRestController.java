package com.example.demo.rest;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	@GetMapping("/all")
	public String showHome() {
		return "WELCOME TO ALL";
	}

	@GetMapping("/profile")
	public String showProfile() {
		return "Login success";
	}

	@GetMapping("/user")
	public Authentication viewUser(Principal p) {
		System.out.println("user is " + p.getName());
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth;
	}
}

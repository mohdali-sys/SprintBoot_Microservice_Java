package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
	
	@GetMapping("/delete")
	public String deleteStd() {
		System.out.println("DELETE IS CALLED!!");
		return "redirect:all";
	}
	
	@GetMapping("/all")
	public String showData() {
		System.out.println("SHOW DATA IS CALLED!!");
		return "stdData";
	}


}

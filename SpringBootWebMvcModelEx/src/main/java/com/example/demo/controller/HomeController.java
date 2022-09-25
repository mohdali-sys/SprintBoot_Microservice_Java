package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	
	@GetMapping("/show")
	public String show(Model model)
	{
		model.addAttribute("title","Spring MVC Web");	
		return "Home";
	}

}

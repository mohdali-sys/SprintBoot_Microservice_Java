package in.nareshit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nareshit.raghu.entity.User;
import in.nareshit.raghu.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService service;
	
	//1. show register page
	@GetMapping("/register")
	public String showReg() {
		return "UserRegister";
	}
	
	
	//2. save user data
	@PostMapping("/save")
	public String saveUser(
			@ModelAttribute User user,
			Model model
			)
	{
		
		Integer id = service.saveUser(user);
		String message = "User '"+id+"' saved";
		model.addAttribute("message", message);
		
		return "UserRegister";
	}
	
	//3. show login page
	@GetMapping("/login")
	public String showLogin() {
		return "UserLogin";
	}
}

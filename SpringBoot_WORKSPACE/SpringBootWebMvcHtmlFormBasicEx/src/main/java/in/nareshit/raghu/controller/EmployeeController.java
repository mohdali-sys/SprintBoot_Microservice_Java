package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.nareshit.raghu.entity.Employee;

@Controller
public class EmployeeController {

	//1. show Register page
	//  /register + GET
	@GetMapping("/register")
	public String showForm() {
		return "EmployeeRegister";
	}
	
	
	//2. Read form data
	//.. /save + POST
	@PostMapping("/save")
	public String readForm(
			@ModelAttribute Employee employee, //READING FORM DATA
			Model model
			) 
	{
		System.out.println(employee);
		//sending data to UI
		model.addAttribute("employee", employee);
		return "EmployeeData";
	}
	
	
}

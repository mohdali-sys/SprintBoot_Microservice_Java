package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	//.../details?ename=AJAY&esal=3.3
	@GetMapping("/details")
	public String showData(
			//@RequestParam("ename") String name,
			@RequestParam(value = "ename", required = false) String name,
			@RequestParam("esal") Double sal,
			Model model //to send data to UI
			) 
	{
		System.out.println("data is "+name+","+sal);
		model.addAttribute("empname", name);
		model.addAttribute("empsal", sal);
		return "EmpData";
	}
}

package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	//..../data?ename=__&esal=___
	
	@GetMapping("/data")
	public String readData(
			@RequestParam("ename") String name,
			//@RequestParam("esal") Double sal,
			@RequestParam(value = "esal", required = false) Double sal,
			Model model
			)
	{
		System.out.println("Data is " + name +"-"+sal);
		model.addAttribute("empName", name);
		model.addAttribute("empSal", sal);
		return "EmployeeData";
	}
}

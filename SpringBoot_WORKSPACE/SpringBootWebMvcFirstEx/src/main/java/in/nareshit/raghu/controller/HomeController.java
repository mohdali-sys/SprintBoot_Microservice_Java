package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// String Return Type --> PageName
	// /show + GET
	@GetMapping("/show")
	public String showPage(Model model) {
		System.out.println(model.getClass().getName());
		
		//key(String),val(object)
		model.addAttribute("title","TEST ABCDEF!!!");
		return "Home";
	}
}

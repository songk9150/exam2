package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String gelloPageModel(Model model) {
		model.addAttribute("greeting", "Hi!");
		return "hello";
	}
}

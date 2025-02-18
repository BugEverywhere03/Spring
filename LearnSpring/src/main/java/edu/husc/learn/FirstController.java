package edu.husc.learn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {
	@GetMapping("/sayHello")
	public String sayHello(Model model) {
		model.addAttribute("message", "Hello Spring !");
		return "hello";
	}
}

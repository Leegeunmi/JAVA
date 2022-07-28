package com.varxyz.banking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/banking/main")
	public String mainForm() {
		return "/banking/main";
	}
}

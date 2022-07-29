package com.varxyz.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("com.varxyz.banking.controller.MainController")
public class MainController {
	
	@GetMapping("/banking/main")
	public String mainForm() {
		return "/banking/main";
	}
}

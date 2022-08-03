package com.varxyz.cafe;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("mainController")
public class MainController {
			
	@GetMapping("main")
	public String mainForm() {
		return "main";
	}
	
}
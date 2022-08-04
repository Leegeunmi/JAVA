package com.varxyz.cafe.manager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.cafe.menuItem.MenuItemCommand;

@Controller("loginController")

public class LoginController {
	
	@GetMapping("manager/login")
	public String loginForm() {
		return "manager/login";
	}
	
	
	@GetMapping("/manager/logout")
	public String doLogout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		session.invalidate();		
		return "manager/login";
	}
	
	
	@PostMapping("/manager/login")
	public String goLogin() {
		return "manager/login_success";
	}
	
//	@GetMapping("/manager/login_success")
//	public String goAddMenuItem() {
//		return "manager/login_success";
//	}
	
}

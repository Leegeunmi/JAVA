package com.varxyz.jvx330.mvc.banking;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginContoller {
	
	@Autowired
	CustomerServiceImpl customerService;
	
	@GetMapping("/banking/login")
	public String loginForm() {
		
		return "banking/login";		
	}
	
	@PostMapping("/banking/login")
	public String login(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		
		if(!customerService.isUser(userId, passwd)) {
			request.setAttribute("msg", "로그인정보 오류");
			request.setAttribute("url", "/banking/login");
			return "alert";
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("userId", userId);
		
		return "/banking/login";
		
	}
}
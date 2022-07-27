package com.varxyz.jvx330.mvc.example3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//현재 빈등록을 안하고 있어도 돌아간다.
//이방식과 빈을 따로 등록하는 방식(앞전)도 알아두면 좋다.
@Controller("example3.loginController")
public class LoginController {
	
	@GetMapping("/example3/login")//get방식 login
	public String loginForm() {
		return "example3/login";
	}
	
//	@PostMapping("/example3/login")//post방식 login
	public ModelAndView login(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userId",userId);
		mav.addObject("passwd",passwd);
		mav.setViewName("example3/login_result");
		return mav;
	}
	
	@PostMapping("/example3/login") //위 @PostMapping을 스프링스타일로 한것 (이걸쓰자)
	public ModelAndView login(@RequestParam(value="userId", required=true)String userId,
								@RequestParam String passwd) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userId",userId);
		mav.addObject("passwd",passwd);
		mav.setViewName("example3/login_result");
		return mav;
	}
}

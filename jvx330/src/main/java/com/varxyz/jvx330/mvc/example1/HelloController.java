package com.varxyz.jvx330.mvc.example1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	//http://localhost:8080/jvx330/example1/sayHello
	@RequestMapping(value ="/example1/sayHello", method = RequestMethod.GET)
	public ModelAndView sayHello() { //sayHello()는 dopost와 같은 역할 / get방식
		String greeting = "Hello! 스프링 MVC";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example1/hello");  //앞전의 forward와 같음
		mav.addObject("greeting", greeting);
		
		return mav;
	}
}

package com.varxyz.jvx330.mvc.example1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ByeController {
	
	@RequestMapping(value="/example1/say", method = RequestMethod.GET)
	public ModelAndView say() {
		String greeting = "See you tomorrow, Spring MVC!";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example1/bye");
		mav.addObject("greeting", greeting);
		
		return mav;
		
	}
}

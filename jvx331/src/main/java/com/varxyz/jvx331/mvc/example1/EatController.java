package com.varxyz.jvx331.mvc.example1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EatController {

	@RequestMapping(value = "/example1/fruit", method = RequestMethod.GET)
	public ModelAndView fruit() {
		String tomato = "TOMATO!!";
		String banana = "BANANA!!";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example1/fruit");
		mav.addObject("tomato", tomato);
		mav.addObject("banana", banana);
		
		return mav;
	}
	
	@RequestMapping(value = "/example1/juice", method = RequestMethod.GET)
	public ModelAndView juice() {
		String tomatoJC = "TOMATO juice";
		String bananaJC = "BANANA juice";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example1/juice");
		mav.addObject("tomatoJC", tomatoJC);
		mav.addObject("bananaJC", bananaJC);
		
		return mav;
		
	}
	
	
}

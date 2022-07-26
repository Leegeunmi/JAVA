package com.varxyz.jvx331.mvc.example2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestMappingController {
	
	@RequestMapping(value = "/example2/mapping", method = RequestMethod.GET)//get방식으로 들어왔을 때 메소드를 불러라
	public String getMapping() {
		return "example2/mapping_result";	
	}
	
	@RequestMapping(value = "/example2/mapping", method = RequestMethod.POST)//POST방식
	public ModelAndView postMapping() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("example2/mapping_result");
		mav.addObject("result", "post 요청의 결과 메세지");
		
		return mav;
	}
}
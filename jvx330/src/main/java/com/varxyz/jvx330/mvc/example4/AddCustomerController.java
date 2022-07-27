package com.varxyz.jvx330.mvc.example4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("example4.addCustomerController")
public class AddCustomerController {
	
	@GetMapping("/example4/add_customer")
	public String addCustomerForm() {
		return "example4/add_customer";
	}
	
	@PostMapping("/example4/add_customer") //네이밍커맨션을 보고 파라메터를 찾아서 CustomerCommand에 넣어줌
	public String addCustomer(CustomerCommand customerCommand, Model model) {
		//빈이거나 API규약에 맞는 것은 아래에서 생성을 따로 안하고 여기서 , 뒤에 바로 추가할 수 있다.
		//앞전의 ModelAndView mav = new ModelAndView();도 마찬가지
		System.out.println(customerCommand.getEmail());
		model.addAttribute("customerCommand", customerCommand);
		return "example4/success_add_customer";
	}
}

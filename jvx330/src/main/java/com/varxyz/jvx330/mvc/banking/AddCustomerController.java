package com.varxyz.jvx330.mvc.banking;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("banking.addCustomerController")
public class AddCustomerController {
	
	@GetMapping("/banking/add_customer")
	public String addCustomerForm() {
		return "banking/add_customer";
	}
	
	@PostMapping("/banking/add_customer")
	public String addCustomer(CustomerCommand customerCommand, Model model) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
	
		AddCustomerDao dao = context.getBean("addCustomerDao", AddCustomerDao.class);
		dao.addCustomer(customerCommand);
		context.close();
		

		System.out.println(customerCommand.getUserId());
		model.addAttribute("customerCommand", customerCommand);
		return "banking/login";
	}
}

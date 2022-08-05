package com.varxyz.cafe.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OderMainController {

	@GetMapping("/*/order_main")
	public String oderMainForm() {
		return "order/order_main";
	}
	
	@GetMapping("/*/select_menuCategory")
	public String resultForm() {
		return "order/select_menuCategory";
	}
	
	@GetMapping("/*/select_menuItem")
	public String selectMenuItem() {
		return "order/select_menuItem";
	}
}

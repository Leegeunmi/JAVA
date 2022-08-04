package com.varxyz.cafe.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OderMainController {

	@GetMapping("/*/order_main")
	public String oderMainForm() {
		return "order/order_main";
	}
}

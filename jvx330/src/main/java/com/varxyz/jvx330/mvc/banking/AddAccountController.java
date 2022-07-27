package com.varxyz.jvx330.mvc.banking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("banking.addAccountController")
public class AddAccountController {
	
	@GetMapping("/banking/add_account")
	public String addAccountForm() {
		return "banking/add_account";
	}
	
	@PostMapping("/banking/add_account") //네이밍커맨션을 보고 파라메터를 찾아서 CustomerCommand에 넣어줌
	public String addAccount(AccountCommand accountCommand, Model model) {
		//빈이거나 API규약에 맞는 것은 아래에서 생성을 따로 안하고 여기서 , 뒤에 바로 추가할 수 있다.
		//앞전의 ModelAndView mav = new ModelAndView();도 마찬가지
		System.out.println(accountCommand.getUserId());
		model.addAttribute("accountCommand", accountCommand);
		return "banking/success_add_account";
	}
}

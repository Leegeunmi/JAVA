package com.varxyz.jvx330.mvc.banking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("banking.SuccessAddAccountController")
public class SuccessAddAcountCotroller {
	
	@GetMapping("/banking/success_add_account")
	public String successAddAccountForm() {
		return "banking/success_add_account";
	}
	
	@PostMapping("/banking/success_add_account")
	public String successAddAcount(AccountCommand accountCommand, Model model) {
		System.out.println(accountCommand.getUserId());
		model.addAttribute("accountCommand", accountCommand);
		return "banking/transfer";
	}
}

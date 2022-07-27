package com.varxyz.jvx330.mvc.banking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GetAccountsController {
	
	@GetMapping("/banking/get_accounts")
	public String getAccountForm() {
		return "banking/get_accounts";
	}
	
	@PostMapping("/banking/get_accounts")
	public String getAccount(AccountCommand accountCommand, Model model) {
		model.addAttribute("accountCommand", accountCommand);
		return "banking/transfer";
	}
}

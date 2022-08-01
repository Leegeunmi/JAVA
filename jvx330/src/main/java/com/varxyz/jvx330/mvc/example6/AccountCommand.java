package com.varxyz.jvx330.mvc.example6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCommand {
	private String email;
	private String passwd;
	private String accountType;
	private String accountNum;
}

package com.varxyz.jvx330.mvc.banking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCommand {
	private String userId;
	private char accType;
	private String accountNum;
	private double balance;
}

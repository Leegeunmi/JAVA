package com.varxyz.banking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCommand {
	private String userId;
	private String accountNum;
	private char accountType;
	private double balance;
}

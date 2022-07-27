package com.varxyz.jvx330.mvc.banking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends Account {
	private double overdraftAmount = 2.0;
	
}

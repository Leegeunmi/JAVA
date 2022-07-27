package com.varxyz.jvx330.mvc.banking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavingsAccount extends Account {
	private double interestRate = 2.0;
	
	public void withdraw(double amount) {
		
	}
}

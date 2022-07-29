package com.varxyz.banking.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavingAccount extends Account{
	
	//이자율
	private double interestRate;
	
	@Override
	public void transfer() {
		
	}

}

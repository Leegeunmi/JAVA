package com.varxyz.jvx330.jdbc.example5;

import com.varxyz.jvx330.jdbc.Account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends Account{
	private double overDraftAmount;

	public Object getInterestRate() {
		// TODO Auto-generated method stub
		return null;
	}

}

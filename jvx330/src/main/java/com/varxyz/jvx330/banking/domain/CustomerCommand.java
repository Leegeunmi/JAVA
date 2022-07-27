package com.varxyz.jvx330.banking.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCommand {
	private String userId;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
}

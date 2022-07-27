package com.varxyz.jvx330.mvc.banking;

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

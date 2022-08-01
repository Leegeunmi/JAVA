package com.varxyz.jvx330.mvc.example5;

import lombok.Getter;
import lombok.Setter;

//2)
@Getter
@Setter
public class CustomerCommand {
	private String email; //이메일을 jsp의 path에 넣는다.
	//9)email1 email2추가 및 변경
	private String email1;
	private String email2;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
	private String phone1;
	private String phone2;
	private String phone3;
}

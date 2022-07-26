package com.varxyz.jvx330.di.example3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Member {//1
	private String userId;
	private String name;
	
	public Member(String userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}	
}

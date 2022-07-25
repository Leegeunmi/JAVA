package com.varxyz.jvx330.jdbc;

import java.sql.Timestamp;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {
	private long aid;
	private Customer customer;
	private String accountNum;
	private char accType;
	private double balance;
	private Date regDate;
	
	public Account(long l, long m, String string, String string2, String string3, String string4, String string5, Timestamp timestamp) {
		super();
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}
}

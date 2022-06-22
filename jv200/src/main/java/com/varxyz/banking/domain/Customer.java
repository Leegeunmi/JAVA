package com.varxyz.banking.domain;

import java.util.*;

public class Customer {
	private String name;
	private String ssn;
	private String phone;
	private String customerID;
	private String password;
	private List<Account> accountList;
	
	public Customer(String name, String ssn, String phone, String customerID, String password) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
		this.customerID = customerID;
		this.password = password;
	}
	
//	public Customer() {//생성자x경우
//		// TODO Auto-generated constructor stub
//	}

	//생성자 만들기 alt shift s -> using
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
}

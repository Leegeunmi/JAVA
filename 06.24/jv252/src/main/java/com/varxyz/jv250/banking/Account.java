package com.varxyz.jv250.banking;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 계좌정보를 캡슐화
 * 
 * @author Administrator
 *
 */
//멤버를 static으로 잡으면 하나만 존재하게된다.
//facarde pattern
//singletone pattern

//Account에는 계좌가 있다. 주인이 있다. 잔고가 있다. 입금 출금을 한다.

public class Account {
	protected long aid;
	protected String accountNum;	// 계좌번호
	protected double balance;		// 잔액
	protected static Customer customer;
	protected Date regDate;
	protected char accountType;
	
	public Account () {
		
	}
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public void deposite(double amount) {	// 입금기능 메소드
		this.balance += amount;
	}
	
	public String getAccountNum() {
		return accountNum;
	} 
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}
	
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", accountNum=" + accountNum + ", balance="
				+ balance + ", regDate=" + regDate
				+ ", accountType=" + accountType + "]";
	}
	
	
	
}
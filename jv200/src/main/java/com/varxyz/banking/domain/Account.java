package com.varxyz.banking.domain;
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
	protected String accountNum; //계좌번호
	protected double balance; //잔액
	protected Customer customer;
	
	//마우스 우클릭 -> source --> getter setter
	
//	public Account(double AccountNum, double balance) {
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		this.balance += amount;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setAccounrNum(String accountNum) {
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
}

//<Account>
//<constructors>
//+Account(initBalance:double)
//<methods>
//+getBalance():double
//+deposit(amt:double):void
//+withdraw(amt:double):void
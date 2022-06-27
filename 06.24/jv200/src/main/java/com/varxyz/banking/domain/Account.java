package com.varxyz.banking.domain;
/**
 * ���������� ĸ��ȭ
 * 
 * @author Administrator
 *
 */
//����� static���� ������ �ϳ��� �����ϰԵȴ�.
//facarde pattern
//singletone pattern

//Account���� ���°� �ִ�. ������ �ִ�. �ܰ� �ִ�. �Ա� ����� �Ѵ�.

public class Account {
	protected String accountNum; //���¹�ȣ
	protected double balance; //�ܾ�
	protected Customer customer;
	
	//���콺 ��Ŭ�� -> source --> getter setter
	
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
package com.varxyz.jv250.banking;

import java.util.Date;

//일반계좌
public class SavingsAccount extends Account{
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	private double interestRate;	// 은행 이자율
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFAULT_INTEREST_RATE);
	}
	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) {
		if (super.balance - amount < 0) {
			// 현재 잔고보다 많은 금액을 출금할시 예외 발생
			throw new InsufficientBalanceException("잔고부족");
		}
		// 현재 잔고보다 작다면 출금 승인
		super.balance -= amount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}

//복잡성을 어떤식으로 다루는가_ 분할을 잘 할 것
//domain을 잘 알것
//전체프로그램을 짜는 path 루트를 알아야한다.
//domain 패키지 /service패키지



//두개일때, 5000개일때 각각 수정해보기
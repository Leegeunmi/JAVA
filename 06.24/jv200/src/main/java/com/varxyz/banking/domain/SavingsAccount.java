package com.varxyz.banking.domain;

//일반계좌
public class SavingsAccount extends Account{
	private static final double DEFULT_INTEREST_RATE = 0.03;
	private double interestRate; //은행 이자율
	
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFULT_INTEREST_RATE);
	}
	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(balance - amount < 0) {
			//현재 잔고보다 많은 금액을 출금할 시 예외발생
			throw new InsufficientBalanceException("잔고부족");
		}
		super.balance -= amount;
	}	
//	public CheckingAccount(String accountNum, double balance, double overdraftAccount) {
//		super(accountNum, balance);
//		this.overdraftAmount = overdraftAmount;
//	}
}

//복잡성을 어떤식으로 다루는가_ 분할을 잘 할 것
//domain을 잘 알것
//전체프로그램을 짜는 path 루트를 알아야한다.
//domain 패키지 /service패키지

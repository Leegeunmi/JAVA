package com.varxyz.banking.domain;

//마이너스계좌
public class CheckingAccount extends Account {
	protected double overdraftAmount = 10000.0; //대출 한도액
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}	
	
	public void withdraw(double amount) {
//		if(balance < amount) {
		if(super.balance < amount) {			
			//잔고부족 시 overdraftAmount금액 한도내에서 추가 출금을 승인
			overdraftAmount -= amount;
		}else {
			//잔고가 부족하지 않다면 현재잔고에서 출금 승인
//			balance -= amount; 
			super.balance -= amount; 
		}
	}
}
//select를 어디에 둘것인가 / 검색비용이 달라진다.
//https://github.com/Kei037/JavaStudy/blob/master/eclipse-workspace/jy201-pj/src/main/java/com/varxyz/banking/domain/CheckingAccount.java
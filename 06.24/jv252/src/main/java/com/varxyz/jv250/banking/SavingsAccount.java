package com.varxyz.jv250.banking;

import java.util.Date;

//�Ϲݰ���
public class SavingsAccount extends Account{
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	private double interestRate;	// ���� ������
	
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
			// ���� �ܰ��� ���� �ݾ��� ����ҽ� ���� �߻�
			throw new InsufficientBalanceException("�ܰ����");
		}
		// ���� �ܰ��� �۴ٸ� ��� ����
		super.balance -= amount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}

//���⼺�� ������� �ٷ�°�_ ������ �� �� ��
//domain�� �� �˰�
//��ü���α׷��� ¥�� path ��Ʈ�� �˾ƾ��Ѵ�.
//domain ��Ű�� /service��Ű��



//�ΰ��϶�, 5000���϶� ���� �����غ���
package com.varxyz.banking.domain;

//�Ϲݰ���
public class SavingsAccount extends Account{
	private static final double DEFULT_INTEREST_RATE = 0.03;
	private double interestRate; //���� ������
	
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFULT_INTEREST_RATE);
	}
	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(balance - amount < 0) {
			//���� �ܰ��� ���� �ݾ��� ����� �� ���ܹ߻�
			throw new InsufficientBalanceException("�ܰ����");
		}
		super.balance -= amount;
	}	
//	public CheckingAccount(String accountNum, double balance, double overdraftAccount) {
//		super(accountNum, balance);
//		this.overdraftAmount = overdraftAmount;
//	}
}

//���⼺�� ������� �ٷ�°�_ ������ �� �� ��
//domain�� �� �˰�
//��ü���α׷��� ¥�� path ��Ʈ�� �˾ƾ��Ѵ�.
//domain ��Ű�� /service��Ű��

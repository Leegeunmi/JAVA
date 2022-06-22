package com.varxyz.banking.domain;

//���̳ʽ�����
public class CheckingAccount extends Account {
	protected double overdraftAmount = 10000.0; //���� �ѵ���
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}	
	
	public void withdraw(double amount) {
//		if(balance < amount) {
		if(super.balance < amount) {			
			//�ܰ���� �� overdraftAmount�ݾ� �ѵ������� �߰� ����� ����
			overdraftAmount -= amount;
		}else {
			//�ܰ� �������� �ʴٸ� �����ܰ��� ��� ����
//			balance -= amount; 
			super.balance -= amount; 
		}
	}
}
//select�� ��� �Ѱ��ΰ� / �˻������ �޶�����.
//https://github.com/Kei037/JavaStudy/blob/master/eclipse-workspace/jy201-pj/src/main/java/com/varxyz/banking/domain/CheckingAccount.java
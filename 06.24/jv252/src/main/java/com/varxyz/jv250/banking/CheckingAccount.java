package com.varxyz.jv250.banking;

//���̳ʽ�����
public class CheckingAccount extends Account {
	protected double overdraftAmount = 10000.0;  // ���� �ѵ���
	
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw(double amount) {
		if (super.balance < amount) {
			// �ܰ������ overdraftAmount �ݾ� �ѵ������� �߰� ����� ����
			overdraftAmount -= amount;
		}else {
			// �ܰ� �������� �ʴٸ� �����ܰ��� ��� ����
			super.balance -= amount;
		}
	}

	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
}
//select�� ��� �Ѱ��ΰ� / �˻������ �޶�����.
//https://github.com/Kei037/JavaStudy/blob/master/eclipse-workspace/jy201-pj/src/main/java/com/varxyz/banking/domain/CheckingAccount.java
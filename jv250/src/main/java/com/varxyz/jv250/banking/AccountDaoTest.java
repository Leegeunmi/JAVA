package com.varxyz.jv250.banking;

import java.util.Date;
import java.util.List;

public class AccountDaoTest {
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("567-59-0123");
		sa.setBalance(45000.0);
		sa.setCustomer(new Customer(1006));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccountType('S');
		
		
		dao.addAccount(sa);
		for (Account account : dao.findAccountsBySsn("852457-2568759")) {
			System.out.println(account);
		}
	}
}

//account�� customer����Ű o
//customer�� �ڿ��� �����̸Ӹ�Ű o
//1:1����
//�ΰ����̺��� �Ѱ��� ū ���̺�� �����ϱ�
//���� - 4������� �� ����⺻���� innerjoin�� ����غ���
//�����丵 ��ƾ �Ŀ﷯ - ý��õ
package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.Customer;

public class BankServiceTest2 {
	public static void main(String[] args) {
		BankService service = BankService.getInstance();
		String name = "��Ź";
		String ssn = "700123-1234567";
		String phone = "010-1234-3232";
		String userId = "workframe";
		String passwd = "7777";
		//1.�ű� ���� ���
		service.addCustomer(name, ssn, phone, userId, passwd);
		try {
			//2.CheckingAccount ����
			service.addCheckingAccount(7000, 0.4, ssn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//3.���� ��� Ȯ��
		Customer customer = service.getCustomerBySsn(ssn);
		System.out.println(customer);
		
			//4.���� ���� ���Ȯ��
		List<Account> myList = service.getAccountBySsn(ssn);
		for(Account account : myList) {
			System.out.println(account);
		}
	}
}

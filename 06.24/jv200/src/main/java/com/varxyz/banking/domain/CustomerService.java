package com.varxyz.banking.domain;

import java.util.*;
import java.util.Collection;

public interface CustomerService { //Customer�� ���� ���񽺸� ó���ϴ� Ŭ����	
	void addCustomer(Customer customer);
	Customer getCustomerBySsn(String ssn);
	Collection<Customer> getAllCustomers();
	int getNumOfCustomers();
	
	
//	List<Account> list = (List<Account>) new CustomerService();
//	
//	public static void addCustomer() {
//		list.addCustomer();
//	}
//	public static void getCustomer() {
//		
//	}
//	public static void getAllCustomers() {
//		
//	}
//	public static void getNumCustomers() {
//		
//	}
	
	
//		List<Account> list = new List<Account>();
//		//1)�ֿ� �޼ҵ�
//		list.addCustomer();			//�ű԰��߰�
//		list.getCustomerBySsn();	//�ֹι�ȣ�� �� ��ȸ
//		list.getAllCustomers();		//��ü �� ���
//		list.getNumOfCustomers();	//��ü �� ��
		

	//2)��Ÿ
	//.CustomerService�� ���� ������ ������ �� �ִ� �Ӽ��� �����ؾ��Ѵ�.
	//.���� ������ ������ �� �ִ� �Ӽ��� �����϶�.
}


//���񽺴� ������ ���θ��� �ٸ����� �ϴ� ���� �ƴ϶� �����ൿ�� ��ο��� �ݺ��ϱ⋚���� �ϳ��� ������ �ȴ�.
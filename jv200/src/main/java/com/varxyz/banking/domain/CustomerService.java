package com.varxyz.banking.domain;

import java.util.*;
import java.util.Collection;

public interface CustomerService { //Customer에 대한 서비스를 처리하는 클래스	
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
//		//1)주요 메소드
//		list.addCustomer();			//신규고객추가
//		list.getCustomerBySsn();	//주민번호로 고객 조회
//		list.getAllCustomers();		//전체 고객 목록
//		list.getNumOfCustomers();	//전체 고객 수
		

	//2)기타
	//.CustomerService는 고객의 정보를 보관할 수 있는 속성을 유지해야한다.
	//.고객의 정보를 유지할 수 있는 속성을 정의하라.
}


//서비스는 각각에 개인마다 다른것을 하는 것이 아니라 같은행동을 모두에게 반복하기떄문에 하나만 있으면 된다.
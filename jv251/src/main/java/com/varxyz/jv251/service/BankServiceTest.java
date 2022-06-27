package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.Customer;

public class BankServiceTest {
	public static void main(String[] args) {
		BankService service = BankService.getInstance();
		String name = "동탁";
		String ssn = "700123-1234567";
		String phone = "010-1234-3232";
		String userId = "workframe";
		String passwd = "7777";
		//1.신규 고객 등록
		service.addCustomer(name, ssn, phone, userId, passwd);
		try {
			//2.SavingsAccount 생성
			service.addSavingsAccount(7000, 0.4, ssn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//3.고객 등록 확인
		Customer customer = service.getCustomerBySsn(ssn);
		System.out.println(customer);
//		for(Account account : customer.getAccountList()) {
//			System.out.println(account);
			//객체를 가져올 것 인지 아닌지
			//더 가져올려면 이거로딩(조인필요(CustomerDao에서 *주민번호로 고객조회)customer와account조인) 필요할 때 가져오려면 레이지로딩
			
			//4.고객 계좌 목록확인
		List<Account> myList = service.getAccountBySsn(ssn);
		for(Account account : myList) {
			System.out.println(account);
		}
	}
}

package com.varxyz.banking.domain;

import java.util.*;


public class AccountServiceImpl implements AccountService {
	private static AccountService service = new AccountServiceImpl();
	private List<Account> accountList = new ArrayList<Account>();
	private CustomerService customerService;
	
	private AccountServiceImpl() {
		customerService = CustomerServiceImpl.getInstance();
	}
	
	public static AccountService getInstance() {
		return service;
	}
	
	public Account createSavingsAccount(String accountNum, double balance, double interestRate) {
		return new SavingsAccount(accountNum, balance, interestRate);
	}
	
	public Account createCheckingsAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	
	//오버로딩
	//Acount에 모든 고객정보가 들어가 완성되어있다.
	/**
	 * 신규 계좌 등록
	 * @param account	계좌정보와 고객정보 전체를 캡슐화
	 */
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	/**
	 * 전달된 ssn을 통해 고객을 조회한 후 신규 계좌 등록
	 * @param account
	 * @param ssn
	 */
	//고객정보가 아직 안찼다  //선택적 항복사항  //ssn을 가지고 customer를 찾아야한다. 우리가 아는 고객정보는 ssn뿐
	public void addAccount(Account account, String ssn) { //인캡슐레이션
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	//수정필요----------------------------------------------------------------
	public List<Account> getAccountBySsn(String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		return customer.getAccountList();
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		for(Account c : accountList) {
			if(accountNum.equals(c.getAccountNum())) {
				return c;
			}
		}
		return null;
	}
}
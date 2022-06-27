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
	
	//�����ε�
	//Acount�� ��� �������� �� �ϼ��Ǿ��ִ�.
	/**
	 * �ű� ���� ���
	 * @param account	���������� ������ ��ü�� ĸ��ȭ
	 */
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	/**
	 * ���޵� ssn�� ���� ���� ��ȸ�� �� �ű� ���� ���
	 * @param account
	 * @param ssn
	 */
	//�������� ���� ��á��  //������ �׺�����  //ssn�� ������ customer�� ã�ƾ��Ѵ�. �츮�� �ƴ� �������� ssn��
	public void addAccount(Account account, String ssn) { //��ĸ�����̼�
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	//�����ʿ�----------------------------------------------------------------
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
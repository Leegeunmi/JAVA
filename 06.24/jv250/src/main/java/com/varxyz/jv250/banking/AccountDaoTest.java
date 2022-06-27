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

//account는 customer포린키 o
//customer는 자연히 프라이머리키 o
//1:1매핑
//두개테이블을 한개의 큰 테이블로 조인하기
//조인 - 4가지방법 중 가장기본적인 innerjoin을 사용해보자
//리팩토링 마틴 파울러 - 첵추천
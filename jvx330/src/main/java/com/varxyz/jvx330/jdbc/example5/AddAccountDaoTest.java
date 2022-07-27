package com.varxyz.jvx330.jdbc.example5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Account;
import com.varxyz.jvx330.jdbc.DataSourceConfig;

public class AddAccountDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		AddAccountDao dao = context.getBean("addAccountDao",AddAccountDao.class);
		addAccount(dao);
		
		context.close();
		
	}

	private static void addAccount(AddAccountDao dao) {
		Account a = new Account();
		a.setAccountNum("123-00-1111");
		a.setAccType('S');
		a.setBalance(5000);
//		a.setInterestRate(1000);
//		a.setOverDraft(10000);
		
	}
}

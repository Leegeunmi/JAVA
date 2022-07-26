package com.varxyz.jvx330.jdbc.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Customer;
import com.varxyz.jvx330.jdbc.DataSourceConfig;

public class AddCustomerDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
	
		AddCustomerDao dao = context.getBean("addCustomerDao", AddCustomerDao.class);
//		addCustomer(dao);
//		addCustomer2(dao);
		addCustomer3(dao);
		
		context.close();
	}
	
	public static void addCustomer(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("mina01@naver.com");
		c.setPasswd("595845");
		c.setName("mina");
		c.setSsn("951245-2777954");
		c.setPhone("010-6666-5555");
		
		dao.addCustomer(c);
		System.out.println("-inserted-");
	}
	
	public static void addCustomer2(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("mina01@naver.com");
		c.setPasswd("595845");
		c.setName("Tom");
		c.setSsn("951245-2777954");
		c.setPhone("010-6666-5555");
		
		dao.addCustomer2(c);
		System.out.println("-inserted-");
	}
	
	public static void addCustomer3(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("james01@naver.com");
		c.setPasswd("556845");
		c.setName("James");
		c.setSsn("881245-2777954");
		c.setPhone("010-3336-5555");
		
		long key = dao.addCustomer3(c);
		System.out.println("-key-" + key);
	}
	
}

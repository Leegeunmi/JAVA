package com.varxyz.jvx330.mvc.banking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
		findAllCustomers(dao);
//		findCustomerByPhone(dao);
		
		context.close();
	}
	

	public static void findAllCustomers(CustomerDao dao) {
		System.out.println("[findAllCustomers()]");
		dao.findAllCustomers().forEach(c -> System.out.println(c));
	}
}
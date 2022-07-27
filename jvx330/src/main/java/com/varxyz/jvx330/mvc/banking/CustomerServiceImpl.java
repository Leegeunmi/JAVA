package com.varxyz.jvx330.mvc.banking;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	
	
	
	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}
	
	public boolean isUser(String userId, String passwd) {		
		return customerDao.isUser(userId, passwd);
	}
	
	public Customer getCustomerByUserId(String userId) {
		return customerDao.getCustomerByUserId(userId);
	}

}

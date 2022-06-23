package com.varxyz.jv250.banking;

import java.util.List;

public class CustomerDaoTest {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		
		//findAllCustomers() Test
		List<Customer> cutomserList = dao.findAllCustomers();
		for(Customer customer : cutomserList) {
			System.out.println(customer);
		}
	}
}

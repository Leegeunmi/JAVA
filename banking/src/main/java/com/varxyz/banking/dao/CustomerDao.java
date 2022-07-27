package com.varxyz.banking.dao;

import java.util.Date;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.banking.command.CustomerCommand;
import com.varxyz.banking.domain.Customer;

//RowMapper안쓰고 빈써서 여기서 파일1개로 해결한 리팩토링
public class CustomerDao {
	private JdbcTemplate jdbcTemplate;
	
	public CustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addCustomer(CustomerCommand customerCommand) {
		String sql = "INSERT INTO Customer (userId, passwd, name, ssn, phone)"
				+ " VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, customerCommand.getUserId(),  customerCommand.getPasswd(),
				customerCommand.getName(), customerCommand.getSsn(), customerCommand.getPhone());
	}
	
	public List<Customer> findAllCustomer() {
		String sql = "SELECT cid, userId, passwd, name, ssn, phone, regDate FROM Customer";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class));
	}
	
	public List<Customer> findCustomerByRegDate(Date regDate) {
		String sql = "SELECT cid, userId, passwd, name, ssn, phone, regDate"
				+ " FROM Customer WHERE DATE(regDate)=?";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class), regDate);	
	}
	
	public Customer findCustomerByEmail(String email) {
		String sql = "SELECT cid, userId, passwd, name, ssn, phone, regDate"
				+ " FROM Customer WHERE email=?";
		
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(Customer.class), email);
	}
	
	public Customer findCustomerBySsn(String ssn) {
		String sql = "SELECT cid, userId, passwd, name, ssn, phone, regDate"
				+ " FROM Customer WHERE ssn=?";
		
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Customer>(Customer.class), ssn);
	}
	
	public boolean loginCustomer(String userId, String passwd) {
		boolean bool = false;
		String sql = "SELECT userId, passwd FROM Customer WHERE userId=?";
		Customer customer = jdbcTemplate.queryForObject(sql, 
				new BeanPropertyRowMapper<Customer>(Customer.class), userId);
		System.out.println("테이블의 아이디 " + customer.getUserId());
		System.out.println("CustomerDao String 값 " + userId);
		System.out.println("CustomerDao " + customer.getPasswd());
		if(userId.equals(customer.getUserId()) && passwd.equals(customer.getPasswd())) {
			bool = true;
			return bool;
		}
		
		return bool;
	}
	
	public long countCustomers() {
		String sql = "SELECT count(*) FROM Customer";
		return jdbcTemplate.queryForObject(sql, Long.class);
	}
	
	
}

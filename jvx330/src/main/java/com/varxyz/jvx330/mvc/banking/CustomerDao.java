package com.varxyz.jvx330.mvc.banking;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.jvx330.mvc.banking.Customer;

public class CustomerDao {
	private JdbcTemplate jdbcTemplate;
	
	public CustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);		
	}
	
	//가입시 회원추가
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer (userId, passwd, name, ssn, phone)"
				+ " VALUES(?,?,?,?,?)";
		jdbcTemplate.update(sql, customer.getUserId(), customer.getPasswd(),
			customer.getName(), customer.getSsn(), customer.getPhone());	
	}
	
	//모든회원조회
	public List<Customer> findAllCustomers() {
		String sql = "SELECT cid, userId, passwd, name, ssn, phone, regDate FROM Customer";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Customer>(Customer.class));
	}
	

	//로그인시 회원아이디비번확인
	public boolean isUser(String userId, String passwd) {
		String sql = "SELECT count(*) FROM Customer WHERE userId=? AND passwd=?";
		boolean result = true;
		int ishere = jdbcTemplate.queryForObject(sql, Integer.class, userId, passwd);
		if(ishere == 0 ) {
			result = false; 
		}
		return result;
	}
}

package com.varxyz.jvx330.banking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class AddCustomerDao {
	private JdbcTemplate jdbcTemplate;
	
	public AddCustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addCustomer(CustomerCommand customerCommand) {
		String sql = "INSERT INTO Customer (userId, passwd, name, ssn, phone)"
				+ " VALUES(?,?,?,?,?)";
		jdbcTemplate.update(sql, customerCommand.getUserId(), customerCommand.getPasswd(),
			customerCommand.getName(), customerCommand.getSsn(), customerCommand.getPhone());
	}

}

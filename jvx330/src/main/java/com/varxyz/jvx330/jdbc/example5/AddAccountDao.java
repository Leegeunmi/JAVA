package com.varxyz.jvx330.jdbc.example5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.varxyz.jvx330.jdbc.Account;

//import 단축키 -> ctrl shift o
public class AddAccountDao {
//	private JdbcTemplate jdbcTemplate;
//	
//	public AddAccountDao(DataSource dataSource) {
//		// TODO Auto-generated constructor stub
//	}

	public void addAccount(Account account) {
		String sql = "INSERT INTO Account (accountNum, accType, balance, interestRate, overDraft)"
				+ "VALUSE(?,?,?,?,?)";
		
//		jdbcTemplate.update(sql, account.getAccountNum(), account.getAccType(),
//				account.getBalance(), account.getInterestRate(), account.getOverDraft());	
	}
}

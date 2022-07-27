package com.varxyz.jvx330.jdbc.example5;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.varxyz.jvx330.jdbc.Account;

public class AccountRowMapper implements RowMapper<Account>{

	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account(rs.getLong("aid"),
				rs.getLong("customerId"), rs.getString("accountNum"),
				rs.getString("accType"), rs.getString("balance"),
				rs.getString("interestRate"),rs.getString("overDraft"),
				rs.getTimestamp("regDate"));
		return account;
	}
	
}

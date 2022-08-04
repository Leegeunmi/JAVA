package com.varxyz.cafe.manager;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class ManagerDao {
	private JdbcTemplate jdbcTemplate;
	
	public ManagerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//관리자 추가
	public void addManager(Manager manager) {
		String sql = "INSERT INTO Manager (branchName, managerName, phone, passwd)"
				+ " VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql,manager.getBranchName(), manager.getManagerName(),
							manager.getPhone(), manager.getPasswd());
	}
	
	//전화번호로 관리자 찾기
	public Manager getManagerByPhone(String phone) {
		String sql = "SELECT * FROM Manager WHERE phone=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Manager>() {

			@Override
			public Manager mapRow(ResultSet rs, int rowNum) throws SQLException {
				Manager manager = new Manager(rs.getLong("mid"),
						rs.getString("branchName"), rs.getString("managerName"),
						rs.getString("phone"), rs.getString("passwd"), rs.getTimestamp("regDate"));
				return manager;
			}
		}, phone);
	}
	
	//비밀번호로 관리자 찾기
	public Manager getManagerByPasswd(String passwd) {
		String sql = "SELECT * FROM Manager WHERE passwd=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Manager>() {
			
			public Manager mapRow(ResultSet rs, int rowNum) throws SQLException {
				Manager manager = new Manager(rs.getLong("mid"),
						rs.getString("branchName"), rs.getString("managerName"),
						rs.getString("phone"), rs.getString("passwd"), rs.getTimestamp("regDate"));
				return manager;
			}

		}, passwd);
	}
}

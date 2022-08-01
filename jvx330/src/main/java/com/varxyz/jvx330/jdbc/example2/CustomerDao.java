package com.varxyz.jvx330.jdbc.example2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.varxyz.jvx330.jdbc.Customer;

public class CustomerDao {
	private JdbcTemplate jdbcTemplate;
	
	public CustomerDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//테이블 SELECT하는 방식 --------
	//사정에 맞게 쓰는 부분 (쿼리사용 - query / queryForObject)
	//프로젝트를 해가며 요구사항이 점점 복잡해지는 가운데 그에 적절한 쿼리가 만들어져야한다.
	public List<Customer> findAllCustomers() {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate FROM Customer";
		
		return jdbcTemplate.query(sql, new RowMapper<Customer>() {//query - 여러번 여러개 써도 가능

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer(rs.getLong("cid"),
						rs.getString("email"), rs.getString("passwd"),
						rs.getString("name"), rs.getString("ssn"),
						rs.getString("phone"), rs.getTimestamp("regDate"));
				return customer;
			}		
		});
	}
	
	public List<Customer> findCustomerByRegDate(Date regDate) {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate"
				+ " FROM Customer WHERE DATE(regDate)=?";
		
		return jdbcTemplate.query(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer(rs.getLong("cid"),
						rs.getString("email"), rs.getString("passwd"),
						rs.getString("name"), rs.getString("ssn"),
						rs.getString("phone"), rs.getTimestamp("regDate"));
				return customer;
			}		
		}, regDate);
	}
	
	public Customer findCustomerByEmail(String email) {
		String sql = "SELECT cid, email, passwd, name, ssn, phone, regDate"
				+ " FROM Customer WHERE email=?";
		
		return jdbcTemplate.queryForObject(sql, new RowMapper<Customer>() {//queryForObject는 하나만 호출 (유니크한 것에 사용)

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer(rs.getLong("cid"),
						rs.getString("email"),rs.getString("passwd"),
						rs.getString("name"),rs.getString("ssn"),
						rs.getString("phone"),rs.getTimestamp("regDate"));
				return customer;
			}
		}, email);
	}
	
	//전체고객의 수를 알고싶을 때
	public long countCustomers() {
		String sql = "SELECT count(*) FROM Customer";
		return jdbcTemplate.queryForObject(sql, Long.class); //이값을 채워서 리턴값으로 달라
	}
}

package com.varxyz.jv251.dao;

import java.nio.file.attribute.AclEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv251.domain.Customer;

public class CustomerDao {
	
	public CustomerDao() {
		
	}
	
	/**
	 * 전체 고객 정보
	 * @return
	 */
	public List<Customer> findAllCustomers() {
		String sql = "SELECT * FROM Customer";
		List<Customer> customerList = new ArrayList<Customer>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection(); //Connection받아오는 방식을 바꾸어도 영향을 받지 않는다.
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) { //이 안에 들어있는 것은 항상 내용을 바꿀 수 있고 위와같은 것은 공통의 것 (프레임웍)이다. 프레임웍을 가져다가 내게 맞게 바꿔(안에것)쓴다.  그러므로 프레임웍 자체가 의미를 가지는 것이 아니다.
					Customer c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userID"));
					customerList.add(c);
				}
			} finally {
				DataSourceManager.close(rs, pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerList;
	}
	
	/**
	 * 주민번호로 고객 조회
	 * @param ssn
	 * @return
	 */
	public Customer findCustomerBySsn(String ssn) {
		String sql = "SELECT * FROM Customer WHERE ssn=?";
		Customer c = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userId"));
				}
			} finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	/**
	 * 신규 고객 등록
	 * @param customer		등록할 고객정보
	 */
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer(name, ssn, phone, userId, passwd) "
				+ " VALUES (?, ?, ?, ?, ?)";
		try {
			Connection con = DataSourceManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getSsn());
			pstmt.setString(3, customer.getPhone());
			pstmt.setString(4, customer.getUserId());
			pstmt.setString(5, customer.getPasswd());
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
			System.out.println("INSERTED...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
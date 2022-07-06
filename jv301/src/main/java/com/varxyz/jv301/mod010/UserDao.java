package com.varxyz.jv301.mod010;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv301.mod010.User;

public class UserDao {
	private DataSource datasource;
	public UserDao() {
		NamingService ns = NamingService.getInstance();
		datasource = (DataSource)ns.getAttribute("dataSource"); // (DataSource)는 캐스팅 한것
	}
	
	public void addUser(User user) {
		String sql = "INSERT INTO User(userId, passwd, userName, ssn, addr, email)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getUserId());
				pstmt.setString(2, user.getPasswd());
				pstmt.setString(3, user.getUserName());
				pstmt.setString(4, user.getSsn());
				pstmt.setString(5, user.getAddr());
				pstmt.setString(6, user.getEmail());
				pstmt.executeUpdate();
			} finally {
				datasource.close(pstmt, con);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public List<User> findAllUsers() {
		String sql = "SELECT * FROM User";
		List<User> userList = new ArrayList<User>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = datasource.getConnection(); 
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) { 
					User u = new User();
					u.setCId(rs.getLong("cid"));
					u.setUserId(rs.getString("userId"));
					u.setPasswd(rs.getString("passwd"));
					u.setUserName(rs.getString("userName"));
					u.setSsn(rs.getString("ssn"));
					u.setAddr(rs.getString("addr"));
					u.setEmail(rs.getString("eamil"));
					userList.add(u);
				}
			} finally {
				datasource.close(rs, pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
	

	public User findUserBySsn(String ssn) {
		String sql = "SELECT * FROM User WHERE ssn=?";
		User u = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					u = new User();
					u.setCId(rs.getLong("cid"));
					u.setUserId(rs.getString("userId"));
					u.setPasswd(rs.getString("passwd"));
					u.setUserName(rs.getString("userName"));
					u.setSsn(rs.getString("ssn"));
					u.setAddr(rs.getString("addr"));
					u.setEmail(rs.getString("eamil"));
				}
			} finally {
				datasource.close(rs, pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
}
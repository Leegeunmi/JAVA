package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample8_Account_UPDATE {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		try {
			Class.forName(driver); //checked exception
			System.out.println("LOADED DRIVER ---> "+ driver);
			
			Connection con = DriverManager.getConnection(url, id, passwd); //checked exception //sql을 문자열로 전달한다.
			System.out.println("CONNECTION TO ---> "+ url);
			
			String sql = "UPDATE Account SET balance=?, overdraft=? WHERE customerId=?";
			PreparedStatement stmt = con.prepareStatement(sql); //수정된 내용 PreparedStatement -> 조건에 맞게 처리 
			stmt.setDouble(1, 7000);
			stmt.setDouble(2, 100000);
			stmt.setLong(3, 1003);
			stmt.executeUpdate();
			
			System.out.println("UPDATED....");
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

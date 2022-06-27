package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample7_Account_INSERT {
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
			
			String sql = "INSERT INTO Account(accountNum, balance, interestRate, overdraft, accountType, customerId, aid)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql); //수정된 내용 PreparedStatement -> 조건에 맞게 처리 
			stmt.setString(1, "55-555-5555");
			stmt.setDouble(2, 8000);
			stmt.setDouble(3, 0.5);
			stmt.setDouble(4, 10000);
			stmt.setString(5, "S");
			stmt.setLong(6, 1001);
			stmt.setLong(7, 3003);
			stmt.executeUpdate();
			
			System.out.println("INSETED....");
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

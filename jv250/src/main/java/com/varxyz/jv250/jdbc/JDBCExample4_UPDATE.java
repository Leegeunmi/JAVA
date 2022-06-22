package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample4_UPDATE {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		try {
			Class.forName(driver); //checked exception
			System.out.println("LOADED DRIVER ---> "+ driver);
			
			Connection con = DriverManager.getConnection(url, id, passwd); //checked exception //sql�� ���ڿ��� �����Ѵ�.
			System.out.println("CONNECTION TO ---> "+ url);
			
			String sql = "UPDATE Customer SET phone=?, customerId=? WHERE cid=?";
			PreparedStatement stmt = con.prepareStatement(sql); //������ ���� PreparedStatement -> ���ǿ� �°� ó�� 
			stmt.setString(1, "010-7777-1111");
			stmt.setString(2, "mysql");
			stmt.setLong(3, 1004);
			stmt.executeUpdate();
			
			System.out.println("UPDATED....");
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

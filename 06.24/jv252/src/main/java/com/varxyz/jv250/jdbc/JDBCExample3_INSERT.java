package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3_INSERT {
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
			
			String sql = "INSERT INTO Customer(name, ssn, phone, customerId, passwd)"
					+ "VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql); //������ ���� PreparedStatement -> ���ǿ� �°� ó�� 
			stmt.setString(1, "�ʼ�"); //sql�� �ƴ϶� java��Ÿ��
			stmt.setString(2, "880121-1859871");
			stmt.setString(3, "010-8959-9875");
			stmt.setString(4, "sql");
			stmt.setString(5, "1234");
			stmt.executeUpdate();
			
			System.out.println("INSETED....");
			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

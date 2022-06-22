package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample6_Account_SELECT {
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
			
			String sql = "SELECT * FROM Account WHERE customerId = ?";
			PreparedStatement stmt = con.prepareStatement(sql); //������ ���� PreparedStatement -> ���ǿ� �°� ó�� 
			stmt.setLong(1, 1001);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) { //�����Ͱ� �ִµ��ȿ� true �ƴϸ� false
				long aid = rs.getLong("aid");
				String accountNum = rs.getString("accountNum");
				double balance = rs.getDouble("balance");
				double interestRate = rs.getDouble("interestRate");
				double overdraft = rs.getDouble("overdraft");
				String accountType = rs.getString("accountType");
				long customerId = rs.getLong("customerId");
				System.out.println(aid);
				System.out.println(accountNum);
				System.out.println(balance);
				System.out.println(interestRate);
				System.out.println(overdraft);
				System.out.println(customerId);
				System.out.println("-----------------------");
			}
			rs.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}

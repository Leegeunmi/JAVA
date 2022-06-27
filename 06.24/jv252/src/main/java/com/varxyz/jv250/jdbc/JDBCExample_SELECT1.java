package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample_SELECT1 {
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
			
			String sql = "SELECT * FROM Customer WHERE name = '유비'";
			Statement stmt = con.createStatement(); //JDBCExample2에서 수정될 내용
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) { //데이터가 있는동안에 true 아니면 false
				long cid = rs.getLong("cid");
				String customerId = rs.getString("customerId"); //DB정보 가져와서 자바의 customerId로
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				System.out.println(cid);
				System.out.println(customerId);
				System.out.println(name);
				System.out.println(phone);
				System.out.println("-----------------------");
			}	
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

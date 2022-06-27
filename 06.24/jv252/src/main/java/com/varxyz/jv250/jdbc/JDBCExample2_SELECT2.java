package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2_SELECT2 {
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
			
			String sql = "SELECT * FROM Customer WHERE name = ?";
			PreparedStatement stmt = con.prepareStatement(sql); //������ ���� PreparedStatement -> ���ǿ� �°� ó�� 
			stmt.setString(1, "����");//sql�� �ƴ϶� java��Ÿ��
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) { //�����Ͱ� �ִµ��ȿ� true �ƴϸ� false
				long cid = rs.getLong("cid");
				String customerId = rs.getString("customerId"); //DB���� �����ͼ� �ڹ��� customerId��
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
		} finally {
			
		}
	}
}

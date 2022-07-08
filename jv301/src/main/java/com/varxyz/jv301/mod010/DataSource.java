package com.varxyz.jv301.mod010;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DataSource와 InitalizeDataSourceListener는 JDBC연동 관련내용이다.
//JDBC(JavaDatabaseConnectivity): 자바에서 데이터베이스 접속할 수 있도록 하는 java API
//자바프로그램이 데이터베이스와 연결되어 데이터를 주고 받을 수 있게 해주는 프로그래밍 인터페이스
//역할: 통역자역할-응용프로그램과 DBMS간의 통신을 중간에서 번역해주는 역할
public class DataSource {
	private String jdbcDriver;
	private String jdbcUrl;
	private String jdbcUserName;
	private String jdbcPasswd;

	public DataSource(String jdbcDriver,String jdbcUrl, String jdbcUserName, String jdbcPasswd) {
		super();
		this.jdbcDriver = jdbcDriver;
		this.jdbcUrl = jdbcUrl;
		this.jdbcUserName = jdbcUserName;
		this.jdbcPasswd = jdbcPasswd;
	}
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(jdbcUrl, jdbcUserName, jdbcPasswd);
		}catch (SQLException e){
			throw new RuntimeException("ConnectionNotAcailableException");
		}
	}
	
	public void close(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs != null && rs.isClosed()) {
			rs.close();
		}
		if(pstmt != null && pstmt.isClosed()) {
			pstmt.close();
		}
		if(con != null && con.isClosed()) {
			con.close();
		}
	}
	
	public void close(PreparedStatement pstmt, Connection con) throws SQLException {
		close(null, pstmt, con);
	}
}


package com.varxyz.jv250.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {
	private static final String JDBC_driver = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_USER = "jv250";
	private static final String JDBC_PASSWORD = "jv250";
	
	public AccountDao() {
		try {
			Class.forName( JDBC_driver);
			System.out.println("LOADED DRIVER --->" +  JDBC_driver);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
//	public List<Account> findALLAccounts() {  // 전체 찾기 *
//		String sql = "SELECT * FROM Account";
//		List<Account> accountList = new ArrayList<>();
//		try {
//			Connection con = null;
//			PreparedStatement pstmt = con.prepareStatement(sql);
//			ResultSet rs = null;
//			try {
//				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
//				pstmt = con.prepareStatement(sql);
//				rs = pstmt.executeQuery();
//				while(rs.next()) {
//					Account a = new Account();
//					a.setAccountNum(rs.getString("accountNum"));
//					a.setBalance(rs.getDouble("balance"));
//					a.setInterestRate(rs.getDouble("interestRate"));
//					a.setOverdraftAmount(rs.getDouble("overdraft"));
//					a.setAccountType(rs.getString("accountType").charAt(0));
//					a.setCustomerId(rs.getLong("customerId"));
//					
////					a.setCustomer(rs.getCustomer("customer"));
//					accountList.add(a);
//				}
//			}finally {
//				rs.close();
//				pstmt.close();
//				con.close();
//			}			
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return accountList;
//	}
	
	/**
	 * 전달된 주민번호를 가진 특정 고객의 계과 목록 조회
	 * @param ssn	주민번호
	 * @param list 
	 * @return
	 */
	public List<Account> findAccountsBySsn(String ssn) {
		String sql = "SELECT a.aid, a.accountNum, a.balance, a.interestRate, "
				+ " a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate" //약칭 AS accountAid
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid"
				+ " WHERE c.ssn = ?";
		List<Account> list = new ArrayList<Account>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				Account account = null;
				while(rs.next()) {
					if ( rs.getString("accountType").charAt(0) == 'S' ) {
						account = new SavingsAccount(sql, 0);
						((SavingsAccount)account).setInterestRate(
								rs.getDouble("interestRate"));
					}else {
						account = new CheckingAccount();
						((CheckingAccount)account).setOverdraftAmount(
								rs.getDouble("overdraft"));
					}
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					account.setCustomer(new Customer(rs.getString("name"),
							rs.getString("ssn"), rs.getString("phone")));
					account.setRegDate(rs.getTimestamp("regDate"));
					account.setAccountType(rs.getString("accountType").charAt(0));
					list.add(account);
				}
			} finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 등록된 모든 계좌 목록 조히
	 * @param ssn
	 * @return
	 */
//	public List<Account> findAccounts() {
//		return null;
//		String sql = "SELECT * FROM Account WHERE ssn = ?";
//		Account a = null;
//		try {
//			Connection con = null;
//			PreparedStatement pstmt = null;
//			ResultSet rs = null;
//			try {
//				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
//				pstmt = con.prepareStatement(sql);
//				pstmt.setString(1, ssn);
//				rs = pstmt.executeQuery();
//				while(rs.next()) {
//					a = new Account();
//					a.setAccountNum(rs.getString("accountNum"));
//					a.setBalance(rs.getDouble("balance"));
//					a.setInterestRate(rs.getDouble("interestRate"));
//					a.setOverdraft(rs.getDouble("overdraft"));
//					a.setAccountType(rs.getString("accountType"));
//					a.setCustomerId(rs.getLong("customerId"));
//					
////					a.setCustomer(rs.getCustomer("customer"));				
//				}
//			}finally {
//				rs.close();
//				pstmt.close();
//				con.close();
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return a;
//	}
	
	/**
	 * 신규계좌등록
	 * @param account
	 */
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType, customerId)"
				 + " VALUES (?, ?, ?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, account.getAccountNum());
				pstmt.setDouble(2, account.getBalance());
				if (account instanceof SavingsAccount) {
					SavingsAccount sa = (SavingsAccount)account;
					pstmt.setDouble(3, sa.getInterestRate());
					pstmt.setDouble(4, 0.0);
					pstmt.setString(5, String.valueOf('S'));
				}else {
					CheckingAccount ca = (CheckingAccount)account;
					pstmt.setDouble(3, 0.0);
					pstmt.setDouble(4, ca.getOverdraftAmount());
					pstmt.setString(5, String.valueOf('C'));
				}
				pstmt.setLong(6, account.getCustomer().getCid());
				pstmt.executeUpdate();
			} finally {
				pstmt.close();
				con.close();
			}
			System.out.println("NEW ACCOUNT INSERTED...\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	public void findAccountsBySsn(SavingsAccount sa) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public Account[] findAccountsBySsn(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}


//드라이브로드는 한번만 될것
//싱글톤 ...? -->


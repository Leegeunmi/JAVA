package com.varxyz.cafe.menuItem;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class MenuItemDao {
	private JdbcTemplate jdbcTemplate;
	
	public MenuItemDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);		
	}
	
	//아이템 추가
	public void addMenuItem(MenuItemCommand menuItemCommand) {
		String sql = "INSERT INTO MenuItem (itemName, itemPrice, itemStock)"
				+ " VALUES (?, ?, ?)";				
		jdbcTemplate.update(sql,menuItemCommand.getItemName(), menuItemCommand.getItemPrice(),
				menuItemCommand.getItemStock());
	}
	
	
	
	
	//아이템 조회
	/*
	 * public List<MenuItem> getAllMenuItem() { String sql =
	 * "SELECT categCode, itemCode, itemName, itemPrice, itemStock, " +
	 * "itemInfo, itemImg, regDate FROM MenuItem"; return jdbcTemplate.query(sql,
	 * new MenuItemRowMapper()); }
	 */	
	
	/*
	 * public List<MenuItem> findAllMenuItem() { String sql =
	 * "SELECT categCode, itemCode, itemPrice, itemStock, " +
	 * "itemInfo, itemImg, regDate FROM MenuItem"; return jdbcTemplate.query(sql,
	 * new BeanPropertyRowMapper<MenuItem>(MenuItem.class)); }
	 */
}
package com.varxyz.cafe.menuItem;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MenuItemRowMapper implements RowMapper<MenuItem> {
	

	@Override
	public MenuItem mapRow(ResultSet rs, int rowNum)
					throws SQLException {
		
		MenuItem menuItem = new MenuItem();
		menuItem.setCategCode(rs.getString("categCode"));
		menuItem.setItemCode(rs.getInt("itemCode"));
		menuItem.setItemName(rs.getString("itemName"));
		menuItem.setItemPrice(rs.getDouble("itemPrice"));
		menuItem.setItemStock(rs.getInt("itemStock"));
		menuItem.setItemImg(rs.getString("intemImg"));
		menuItem.setRegDate(rs.getDate("regDate"));
		return menuItem;
	}
	
}

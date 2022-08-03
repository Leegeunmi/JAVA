package com.varxyz.cafe.menuCategory;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MenuCategoryRowMapper implements RowMapper<MenuCategory> {
	
	@Override
	public MenuCategory mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		
		MenuCategory menuCategory = new MenuCategory();
		menuCategory.setCategCode(rs.getString("categCode"));
		menuCategory.setCategName(rs.getString("categName"));
		
		return menuCategory;
	}

}

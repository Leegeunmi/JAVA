package com.varxyz.cafe.menuCategory;

import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.cafe.menuItem.MenuItemRowMapper;

public class MenuCategoryDao {
	private JdbcTemplate jdbcTemplate;
	
	public MenuCategoryDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//카테고리 추가
	public void addMenuCategory(MenuCategory menuCategory) {
		String sql = "INSERT INTO MenuCategory(categName, categCode)"
						+ "VALUES(?,?)";
		jdbcTemplate.update(sql, menuCategory.getCategName(), menuCategory.getCategCode());
	}
	
	//카테고리 조회
	public List<MenuCategory> getAllMenuCategory() {
		String sql = "SELECT categName, categCode, FROM MenuCategory";
				
		return jdbcTemplate.query(sql, new MenuCategoryRowMapper());
	}
	
	public List<MenuCategory> getMenuCategoryByCategCode(String categCode) {
		String sql = "SELECT categName, categCode, FROM MenuCategory"
				+ " WHERE categCode=?";
				
		return jdbcTemplate.query(sql, new MenuCategoryRowMapper(), categCode);
	}
}

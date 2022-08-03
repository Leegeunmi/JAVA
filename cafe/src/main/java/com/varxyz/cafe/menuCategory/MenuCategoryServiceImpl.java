package com.varxyz.cafe.menuCategory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class MenuCategoryServiceImpl implements MenuCategoryService{

	@Autowired
	MenuCategoryDao menuCategoryDao;
	
	@Override
	public void addMenuCategory(MenuCategory menuCategory) {
		menuCategoryDao.addMenuCategory(menuCategory);
		
	}

	@Override
	public List<MenuCategory> getAllMenuCategory() {
		
		return null;
	}

	@Override
	public List<MenuCategory> getMenuCategoryByCategCode(String categCode) {
		
		return null;
	}

}

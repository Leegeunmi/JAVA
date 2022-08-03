package com.varxyz.cafe.menuCategory;

import java.util.List;

public interface MenuCategoryService {
	public void addMenuCategory(MenuCategory menuCategory);
	List<MenuCategory> getAllMenuCategory();
	List<MenuCategory> getMenuCategoryByCategCode(String categCode);
}

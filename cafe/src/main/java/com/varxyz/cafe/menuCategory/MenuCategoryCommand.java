package com.varxyz.cafe.menuCategory;

import com.varxyz.cafe.menuItems.MenuItemsCommand;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuCategoryCommand {
	private String categoryName;
	private MenuItemsCommand menuItems;
}

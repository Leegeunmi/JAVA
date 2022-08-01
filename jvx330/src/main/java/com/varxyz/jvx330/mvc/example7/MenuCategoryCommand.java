package com.varxyz.jvx330.mvc.example7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuCategoryCommand {
	private String categoryName;
	private MenuItemsCommand menuItems;
}

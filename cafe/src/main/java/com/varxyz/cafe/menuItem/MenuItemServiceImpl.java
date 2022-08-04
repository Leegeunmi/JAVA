package com.varxyz.cafe.menuItem;

import org.springframework.beans.factory.annotation.Autowired;

public class MenuItemServiceImpl implements MenuItemService{
	
	@Autowired
	MenuItemDao menuItemDao;
	
	
	@Override
	public void addMenuItem(MenuItemCommand menuItemCommand) {
		menuItemDao.addMenuItem(menuItemCommand);
	}

}

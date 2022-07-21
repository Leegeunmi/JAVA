package com.varxyz.jvx330.di.example6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class MenuItemService {
	
	@Autowired
	private MenuItemDao menuItemDao;
	
	public MenuItemService(MenuItemDao menuItemDao) {
		this.menuItemDao = menuItemDao;
	}
	
	public List<MenuItem> getAllMenuItems() {
		return menuItemDao.findAllMenuItems();
	}
}
package com.varxyz.jvx330.di.example6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MenuController {
	
	@Autowired
	@Qualifier("menuItemDao")
	private MenuItemService service;
	
	public void processRequest() {
		service.getAllMenuItems();
	}
}

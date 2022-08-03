package com.varxyz.cafe.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.cafe.menuItem.MenuItem;
import com.varxyz.cafe.menuItem.MenuItemCommand;
import com.varxyz.cafe.menuItem.MenuItemServiceImpl;

@Controller
public class AddMenuItemController {

	@Autowired
	MenuItemServiceImpl menuItemService;
	
	@GetMapping("manager/add_menuItem")
	public String addCustomerForm() {
		return "/manager/add_menuItem";
	}
	
	
	@PostMapping("manager/add_menuItem")
	public String addMenuItem(@ModelAttribute("menuItem")
						MenuItemCommand menuItem, Model model) {
		model.addAttribute("meniItem", menuItem);
		return "manager/add_menuItem_success";
	}
}

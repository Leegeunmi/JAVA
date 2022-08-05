package com.varxyz.cafe.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.varxyz.cafe.menuItem.MenuItem;
import com.varxyz.cafe.menuItem.MenuItemCommand;
import com.varxyz.cafe.menuItem.MenuItemServiceImpl;

@Controller
public class AddMenuItemController {

	@Autowired
	MenuItemServiceImpl menuItemService;

	@GetMapping("manager/add_menuItem")
	public String addCustomerForm(Model model) {
		model.addAttribute("menuItem", new MenuItemCommand());
		return "/manager/add_menuItem";
	}
	
	

	 /*@PostMapping("/manager/add_menuItem") 
	 public String addMenuItem(@ModelAttribute("menuItem") 
	 								MenuItemCommand menuItem , Model model) {
		 model.addAttribute("menuItem", menuItem);
		 menuItemService.addMenuItem(menuItem);
		 return "manager/add_menuItem"; 
	}*/
	 
	
	@PostMapping("manager/add_menuItem")
	public String addMenuItem(@ModelAttribute("menuItem") MenuItemCommand menuItem, Model model) {
		menuItemService.addMenuItem(menuItem);
		model.addAttribute(menuItem);
		return "manager/add_menuItem_success";
	}
	
	@GetMapping("manager/add_menuItem_success")
	public String resultForm() {
		return "manager/add_menuItem_success";
	}
	
}

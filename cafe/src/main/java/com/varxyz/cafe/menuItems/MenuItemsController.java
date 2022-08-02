package com.varxyz.cafe.menuItems;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("menuItemsController")
@RequestMapping("/cafe/add_menuItems")
public class MenuItemsController {
	
	@GetMapping
	public String addMenuItemsForm(Model model) {
		model.addAttribute("menuItems", new MenuItemsCommand());
		return "cafe/add_menuItems";
	}
	
	@ModelAttribute("teaProviderList")
	public List<String> getTeaProviderList() {
		List<String> listt = new ArrayList<String>();
		
		listt.add("Apple Tea 5,000");
		listt.add("Mint Tea 5,000");
		listt.add("Vanila Tea 6,000");
		listt.add("Chamomile Tea 6,000");
		
		return listt;
	}
	
	@PostMapping
	public String addMenuItems(@ModelAttribute("menuItems")
					MenuItemsCommand menuItems, Model model) {
		
		model.addAttribute("menuItems", menuItems);
		return "cafe/success_menuItems";
	}
	
}

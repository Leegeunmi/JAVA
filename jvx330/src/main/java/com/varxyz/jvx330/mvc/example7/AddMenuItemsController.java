package com.varxyz.jvx330.mvc.example7;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("example7.addMenuItemController")
@RequestMapping("/example7/add_menuItems")
public class AddMenuItemsController {
	
	@GetMapping
	public String addMenuItemsForm(Model model) {
		model.addAttribute("menuItems", new MenuItemsCommand());
		return "example7/add_menuItems";
	}
	
	@ModelAttribute("teaProviderList")
	public List<String> getTeaProviderList() {
		List<String> list = new ArrayList<String>();
		
		list.add("Apple tea");
		list.add("Mint tea");
		list.add("Vanila tea");
		list.add("Chamomile tea");
		
		return list;
	}
	
	@PostMapping
	public String addMenuItems(@ModelAttribute("menuItems")
					MenuItemsCommand menuItems, Model model) {
		
//		String name = "Apple tea";
//		double price = 5000;
//		
//		menuItems.set(name);
//		
//		
		model.addAttribute("menuItems", menuItems);
		return "example7/view_menuItems";
	}
	
}

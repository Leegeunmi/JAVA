package com.varxyz.cafe.menuCategory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("menuCategoryController")
@RequestMapping("/cafe/add_menuCategory")
public class MenuCategoryController {
	
	@GetMapping
	public String addMenuCategoryForm(Model model) {
		model.addAttribute("menuCategory", new MenuCategoryCommand());
		return "cafe/add_menuCategory";
	}
	
	@ModelAttribute("menuCategoryProviderList")
	public List<String> getMenuCategoryProviderList() {
		List<String> list = new ArrayList<String>();
		
		list.add("Brewing");
		list.add("HandDrip");
		list.add("Tea");
		list.add("Drink");
		list.add("Croissant");
		list.add("Cake");
		
		return list;
	}
	
	@PostMapping
	public String addMenuCategory(@ModelAttribute("menuCategory")
					MenuCategoryCommand menuCategory, Model model) {
		
		model.addAttribute("menuCategory", menuCategory);
		return "cafe/add_menuItems";
	}
	
}

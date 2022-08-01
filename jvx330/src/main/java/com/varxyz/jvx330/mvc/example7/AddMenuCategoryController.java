package com.varxyz.jvx330.mvc.example7;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("example7.addMenucategoryController")
@RequestMapping("/example7/add_menuCategory")
public class AddMenuCategoryController {
	
	@GetMapping
	public String addMenuCategoryForm(Model model) {
		model.addAttribute("menuCategory", new MenuCategoryCommand());
		return "example7/add_menuCategory";
	}
	
	@ModelAttribute("menuCategoryProviderList")
	public List<String> getCategoryProviderList() {
		List<String> list = new ArrayList<String>();
		
		list.add("Brewing");
		list.add("Hand drip");
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
		return "example7/add_menuItems";
	}
	
}

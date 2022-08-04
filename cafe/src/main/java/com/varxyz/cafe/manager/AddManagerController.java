package com.varxyz.cafe.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.varxyz.cafe.menuItem.MenuItem;
import com.varxyz.cafe.menuItem.MenuItemCommand;

@Controller
public class AddManagerController {

	@Autowired
	ManagerServiceImpl managerService;

	@GetMapping("manager/add_manager")
	public String addManagerForm() {
		return "/manager/add_manager";
	}

	/*
	 * @PostMapping("manager/add_manager") public String
	 * addManager(@ModelAttribute("manager") ManagerCommand manager, Model model) {
	 * model.addAttribute("manager", manager); return "manager/add_manager_success";
	 * }
	 */

	
	@PostMapping("manager/add_manager")
	public String addManager(ManagerCommand managerCommand, Model model) {
		model.addAttribute("managerCommand", managerCommand);	
		Manager manager = new Manager();
		manager.setBranchName(managerCommand.getBranchName());
		manager.setManagerName(managerCommand.getManagerName());
		manager.setPhone(managerCommand.getPhone());
		manager.setPasswd(managerCommand.getPasswd());
		managerService.addManager(manager);
		return "manager/add_manager_success";
	}
	 
}

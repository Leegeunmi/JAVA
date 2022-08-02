package com.varxyz.cafe.paying;

import com.varxyz.cafe.menuItems.MenuItemsCommand;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayingCommand {
	private MenuItemsCommand menuItems;
	private double total;
	
}

package com.varxyz.jvx330.mvc.example7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayingCommand {
	private MenuItemsCommand menuItems;
	private double total;
	
}

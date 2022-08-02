package com.varxyz.cafe.menuItems;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuItemsCommand {
	private String itemName;
	private String teaName;
	private double price;
	private double quantity;
	
	/*
	 * public MenuItemsCommand() {}; public MenuItemsCommand(String itemName, double
	 * price) { this.itemName = itemName; this.price = price; }
	 * 
	 * @Override public String toString() { return "메뉴아이템 [name=" + itemName +
	 * ", price=" + price + "]"; }
	 */
}

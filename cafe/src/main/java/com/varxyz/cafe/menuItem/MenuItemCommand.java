package com.varxyz.cafe.menuItem;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MenuItemCommand {
	/* private String categName; */
	private String itemName;
	private double itemPrice;
	private int itemStock;
	/* private String itemImg; */	
	public MenuItemCommand() {
		super();
	}
}

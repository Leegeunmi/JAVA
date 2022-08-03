package com.varxyz.cafe.menuItem;

import java.util.Date;

import com.varxyz.cafe.menuCategory.MenuCategory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuItemCommand {
	/* private String categName; */
	private String itemName;
	private double itemPrice;
	private int itemStock;
	private String itemImg;
}

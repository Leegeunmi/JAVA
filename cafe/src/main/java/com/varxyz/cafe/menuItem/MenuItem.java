package com.varxyz.cafe.menuItem;

import java.util.Date;

import com.varxyz.cafe.menuCategory.MenuCategory;
import com.varxyz.cafe.menuItem.MenuItem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MenuItem {
	private String categCode;
	private int itemCode;
	/* private String categName; */
	private String itemName;
	private double itemPrice;
	private int itemStock;
	/* private String itemImg; */
	private Date regDate;
	
	public MenuItem() {
		
	}
	
//	public menuItem(int itemCode) {
//		this.itemCode = itemCode;
//	}

}

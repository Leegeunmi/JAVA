package com.varxyz.cafe.menuItems;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuItems {
	private long mid;
	private String itemName;
	private String teaName;
	private double price;
	private double quantity;
	private Date regDate;

}

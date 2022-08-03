package com.varxyz.cafe.order;

import com.varxyz.cafe.menuItem.MenuItemCommand;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	private int orderNum;
	private double total;
}

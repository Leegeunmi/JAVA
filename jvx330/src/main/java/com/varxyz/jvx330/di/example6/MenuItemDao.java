package com.varxyz.jvx330.di.example6;

import java.util.List;

public class MenuItemDao {
	public List<MenuItem> findAllMenuItems() {
		return List.of(new MenuItem("토마토쥬스",3000), new MenuItem("소보루빵",1500));
	}
}

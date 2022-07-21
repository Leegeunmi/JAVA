package com.varxyz.jvx330.di.example7;

import java.util.List;

public interface MenuItemService {
	//신규 메뉴아이템등록
	void addMenuItem(MenuItem item);
	
	//등록된 모든 메뉴 조회
	List<MenuItem> getAllMenuItemList();


	//메뉴이름으로 메뉴검색
	public MenuItem getMenuItem(String string);
}

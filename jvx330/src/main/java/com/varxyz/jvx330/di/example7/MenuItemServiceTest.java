package com.varxyz.jvx330.di.example7;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class MenuItemServiceTest {
	public static void main(String[] args) {
		GenericApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		MenuItemService itemService = context.getBean("menuItemService",MenuItemService.class);
	
		//1.등록
		itemService.addMenuItem(new MenuItem("토마토쥬스",3000.0));
		itemService.addMenuItem(new MenuItem("소보루빵",1500.0));
		
		//2.조회
		List<MenuItem> list = itemService.getAllMenuItemList();
		for(MenuItem item : list) {
			System.out.println(item);
		}
		System.out.println("---------------------------------------");
		
		//3.검색
		MenuItem item = itemService.getMenuItem("토마토쥬스");
		System.out.println(item);
		context.close();
	}
}

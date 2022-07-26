package com.varxyz.jvx330.lifecycle.example3;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.varxyz.jvx330.lifecycle.AppConfig;

public class Horse {
	 
//	@PostConstruct
//	public void initAnimalData() {		
//	}
	
	private static int count;
	
	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		GenericApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		context.getBean("horse", Horse.class);
		context.getBean("horse", Horse.class);
		context.getBean("horse", Horse.class);
		System.out.println("Horse final count: " + Horse.getCount());
		context.close();
	}
	
}

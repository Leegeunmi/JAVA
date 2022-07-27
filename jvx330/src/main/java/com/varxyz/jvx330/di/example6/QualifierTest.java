package com.varxyz.jvx330.di.example6;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.varxyz.jvx330.di.example5.ex2.CartController;

public class QualifierTest {
	public static void main(String[] args) {
		String config = "com/varxyz/jvx330/di/example5/ex3/beans.xml";
		GenericApplicationContext context = new GenericXmlApplicationContext(config);
		
		CartController controller = context.getBean("cartController",CartController.class);
		controller.processRequest();
		context.close();
	}
}

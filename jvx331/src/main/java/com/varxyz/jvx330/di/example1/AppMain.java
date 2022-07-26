package com.varxyz.jvx330.di.example1;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		String config="com/varxyz/jvx330/di/example1/beans.xml";
		GenericApplicationContext context = new GenericXmlApplicationContext(config);
		
		
		
		Foo foo = context.getBean("foo", Foo.class);	
		System.out.println("foo" + foo);
		
		Foo foo2 = context.getBean("foo2", Foo.class);	
		System.out.println("foo" + foo);
		//위와 같은 값이 나온다 (같은 hashCode)  -> 같은 객체 재사용
		
		context.close();
		
		
		
//		기존방식		
//		Bar bar = new Bar();
//		Foo foo = new Foo();
	}
}

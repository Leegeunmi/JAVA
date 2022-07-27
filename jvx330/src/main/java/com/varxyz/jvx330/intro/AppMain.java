package com.varxyz.jvx330.intro;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		String config="com/varxyz/jvx330/intro/beans.xml";
		GenericApplicationContext context = new GenericXmlApplicationContext(config);
		
		
		//new 하지 않았으니 잘 알수가 없다.
		//spring은 자기가 필요한 클래스를 사용하기위해 bean을 사용한다.
		Hello hello = context.getBean("helloBean", Hello.class);	
//		Hello hello = new HelloBeanEn();
		System.out.println(hello.sayHello("Spring"));
		context.close();
	}
}

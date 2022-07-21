package com.varxyz.jvx330.di.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AppMain {//5 (DI)
	public static void main(String[] args) {
		//String config="com/varxyz/jvx330/di/example3/beans.xml"; //xml방식
//		GenericApplicationContext context = new GenericXmlApplicationContext(config);
		GenericApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MemberService ms = context.getBean("memberService",MemberService.class);
		ms.getAllMembers().forEach(member -> System.out.println(member));//아래의 내용과 같다.
		/*List<Member> list = ms.getAllMembers();
		  	for(Member member : list) {
		  		System.out.println(member)
		  }*/
		
//		System.out.println(ms.getAllMembers());	
		context.close();
	}
}

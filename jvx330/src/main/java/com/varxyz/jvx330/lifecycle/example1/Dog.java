package com.varxyz.jvx330.lifecycle.example1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.varxyz.jvx330.lifecycle.AppConfig;
import com.varxyz.jvx330.lifecycle.example2.Eagle;

public class Dog implements InitializingBean, DisposableBean{
	private String name;
	
	public Dog(String name) { //String으로 등록하는 방식(1)
		this.name = name;
	}
	
	public void setName(String name) { //set으로 등록하는 방식(2)
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception { //프로퍼티세팅이 다 끝난다음에 불려지는 메소드
		System.out.println("afterPropertiesSet 호출");
		if(name == null) {
			System.out.println("Properties name must be set");
		}else {
			System.out.println(name);
		}	
	}
	
	@Override
	public void destroy() throws Exception { //빈이 제거되기 직전에 실행
		System.out.println("destroy 호출");
		
	}
	
	
	public static void main(String[] args) {
		GenericApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Dog dog = context.getBean("dog",Dog.class);
		System.out.println("Dog's final name: "+ dog.getName());
		context.close();
		
//		Eagle eagle = context.getBean("eagle",Eagle.class);
//		System.out.println("Eagle's final name: "+ eagle.getName());
//		context.close();
	}

}

//빈이 있고 빈 내부에 프로퍼티가 있다 (멤버변수가있다)
//내가 하고싶은 일이 특정 프로퍼티가 다 채워져야 할 수 있는 일이 있다면 외부에서 프로퍼티가 채워져야한다.
//servlet라이프사이클을 스프링이 일반 클래스에서도 할 수 있게 해주는 것
//100개의 변수가 있을 때 98번째의 변수가 들어와야 할 수 있는 작업이 있을 때 afterPropertiesSet 메소드가 필요하다.


package com.varxyz.jvx330.lifecycle.example2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.varxyz.jvx330.lifecycle.AppConfig;
import com.varxyz.jvx330.lifecycle.example1.Dog;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Eagle {	
	private String name;
	
	public void attachWings() {
		System.out.println("Eagle의 날개를 달아줍니다.");//initMethod test
	}
	
	public void detachWings() {
		System.out.println("Eagle의 날개를 회수합니다.");//destroyMethod test
	}
	
	public static void main(String[] args) {
		GenericApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Eagle eagle = context.getBean("eagle", Eagle.class);
		System.out.println("Eagle's final name : " + eagle.getName());
		context.close();
	}
}

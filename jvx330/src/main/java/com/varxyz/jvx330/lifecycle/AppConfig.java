package com.varxyz.jvx330.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.varxyz.jvx330.lifecycle.example1.Dog;
import com.varxyz.jvx330.lifecycle.example2.Eagle;
import com.varxyz.jvx330.lifecycle.example3.Goat;
import com.varxyz.jvx330.lifecycle.example3.Horse;

@Configuration
public class AppConfig {
	@Bean
	public Dog dog() {
		Dog d = new Dog("플루토");
		d.setName("볼트");
		return d;
		//xml로 적을 경우 :
//		<bean name="dog" class="com.varxyz.jvx330.lifecycle.ex1.Dog>
//			<constructor-arg index="0" type="java.lang.String" value="플루토"/>
//			<property name="name" value="볼트"/>
//		</bean>
	}
	
	
	@Bean(initMethod = "attachWings", destroyMethod = "detachWings")
	public Eagle eagle() {
		Eagle e = new Eagle();
		e.setName("에디");
		return e;
	}
	
	@Bean
	@Scope("prototype")// 여러번 호출해도 한번만 나온다.(하나를 만들어 여러번 재사용)
	public Goat goat() {
		return new Goat();
	}
	
	@Bean
	@Scope("prototype")// 여러번 호출하면 여러번 나온다.(ex)4개 사용할 때 4개 만듬)
	public Horse hourse() {
		return new Horse();
	}
	//스프링이 디스트로이관련해서 싱글톤에서는 호출 해준다.
	//스프링이 디스트로이관련해서 프로토타입에서는 호출을 언제해줄지 모른다.
}

package com.varxyz.cafe;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc //스프링 MVC설정에 대한 기본구성 제공  //web프로젝트하는데 필요한 MVC
@ComponentScan(basePackages = "com.varxyz.cafe")//cafe밑에 있는 것을 모두 스캔
public class WebMVCConfig implements WebMvcConfigurer{
	
	//DispatcherServlet의 매핑경로를 "/"로 주었을 때, JSP/HRML/CSS등을 바르게 처리하도록 한다.
	//<mvc:default-servlet-handler>
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	
//	서비스 워크드패턴(?)	
//	컨트롤러 처리결과를 jsp로 표시하기 위한 설정
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/", ".jsp");//서버돌릴때 주소창에 앞에는 /WEB-INF/views/를 뒤에는 .jsp를 생략시킬 수 있게함
	}

	
//	src/main/webapp/resources 위치의 정적 리소스를 설정
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

}

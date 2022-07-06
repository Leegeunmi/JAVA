package com.varxyz.jv301.mod010;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class InitalizeDataSourceListener implements ServletContextListener {

	private static final String JDBC_FILE_PATH = "/WEB-INF/classes/jdbc.properties";

	public void contextInitialized(ServletContextEvent event)  {  //web application 초기화 관련 작업 메서드    	
    	ServletContext context = event.getServletContext();
    	InputStream is = null; //InputStream은 데이터를 읽는다.
    	try {
    		is = context.getResourceAsStream(JDBC_FILE_PATH);
    		Properties prop = new Properties();
    		prop.load(is);
    		
    		String jdbcDriver = prop.getProperty("jdbc.driver");
    		String jdbcUrl = prop.getProperty("jdbc.url");
    		String jdbcUserName = prop.getProperty("jdbc.userName");
    		String jdbcPasswd = prop.getProperty("jdbc.passwd");

    		DataSource dataSource = new DataSource(jdbcDriver, jdbcUrl, jdbcUserName, jdbcPasswd);

    		NamingService namingService = NamingService.getInstance();
    		namingService.setAttribute("dataSource", dataSource);
    		
    		System.out.println("DataSource has been initalized");
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }
	
    public void contextDestroyed(ServletContextEvent event)  { //web application 종료 직전에 실행되는 메서드
    	System.out.println("contextDestroyed() method called");
    }
    
    
}

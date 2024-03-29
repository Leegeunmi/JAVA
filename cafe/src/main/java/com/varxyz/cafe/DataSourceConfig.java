package com.varxyz.cafe;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.varxyz.cafe.manager.ManagerDao;
import com.varxyz.cafe.manager.ManagerServiceImpl;
import com.varxyz.cafe.menuItem.MenuItemDao;
import com.varxyz.cafe.menuItem.MenuItemServiceImpl;


@Configuration
public class DataSourceConfig {
	
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/cafe?serverTimezone=Asia/Seoul");
		ds.setUsername("cafe");
		ds.setPassword("cafe");
		ds.setInitialSize(2); //커넥션 풀 초기화시 생성할 초기 커넥션 갯수(기본값 10)
		ds.setMaxActive(10); //풀에서 가져올 수 있는 최대 커넥션 갯수 (기본값 100)
		ds.setMaxIdle(10); //풀에 유지할 수 있는 최대 커넥션 수 (기본값 max에 준함)I
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	@Bean
	public MenuItemDao menuItemDao() {
		return new MenuItemDao(dataSource());
	}
	
	@Bean
	public MenuItemServiceImpl menuItemService() {
		return new MenuItemServiceImpl();
	}
	
	@Bean
	public ManagerDao managerDao() {
		return new ManagerDao(dataSource());
	}
	
	@Bean
	public ManagerServiceImpl managerService() {
		return new ManagerServiceImpl();
	}
	
}

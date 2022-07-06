package com.varxyz.jv301.mod010;

import java.util.List;

public class UserService {//비지니스서비스업무담당
	public UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser(User user) {
		userDao.addUser(user);
	}
	
	public List<User> findAllUsers(User user) {
		return userDao.findAllUsers();
	}
}

package com.varxyz.jv301.mod010;

import java.util.List;

public class UserService {//비지니스서비스업무담당
	private static UserService service = new UserService();
	public UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}
	
	public List<User> findAllUsers(User user) {
		return userDao.findAllUsers();
	}

	public boolean isValidUser(String userId, String passwd) {
		
		return true;
	}
}

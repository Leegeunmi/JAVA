package com.varxyz.cafe.manager;

import org.springframework.beans.factory.annotation.Autowired;

public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	ManagerDao managerDao;
	
	@Override
	public void addManager(Manager manager) {
		managerDao.addManager(manager);
	}
	
	public Manager getManagerByphone(String phone) {
		return managerDao.getManagerByPhone(phone);
	}
	
	public Manager getManagerByPasswd(String passwd) {
		return managerDao.getManagerByPasswd(passwd);
	}
}

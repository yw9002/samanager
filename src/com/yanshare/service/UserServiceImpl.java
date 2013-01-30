package com.yanshare.service;

import java.util.List;

import com.yanshare.dao.UserDao;
import com.yanshare.entity.User;
import com.yanshare.entity.UserRole;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public int findUserbyUser(User user) {
		return userDao.findUserbyUser(user);
	}

	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userDao.getUserList();
	}

	public User findUserById(User user) {
		// TODO Auto-generated method stub
		return userDao.findUserById(user);
	}

	public List<UserRole> getUserRoleList() {
		// TODO Auto-generated method stub
		return userDao.getUserRoleList();
	}

	public int addUser(User user,String opr) {
		// TODO Auto-generated method stub
		return userDao.addUser(user,opr);
	}

	public int delUser(User user) {
		// TODO Auto-generated method stub
		return userDao.delUser(user);
	}
}

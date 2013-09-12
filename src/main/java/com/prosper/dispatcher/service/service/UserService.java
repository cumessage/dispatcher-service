package com.prosper.dispatcher.service.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.prosper.dispatcher.service.bean.User;
import com.prosper.dispatcher.service.dao.UserDao;
import com.prosper.dispatcher.service.exception.DataExistException;
import com.prosper.dispatcher.service.exception.DataNotExistException;

public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * 注册
	 */
	public void register(String userName, String password) { 
		if (userDao.isUserNameExist(userName)) {
			throw new DataExistException();
		}
		userDao.add(new User(userName, password));
	}
	
	/**
	 * 登陆
	 */
	public void login(String userName, String password) {
		if (!userDao.exist(new User(userName, password))) {
			throw new DataNotExistException();
		}
		// TODO
	}

}

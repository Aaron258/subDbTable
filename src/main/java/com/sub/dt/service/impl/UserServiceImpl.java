package com.sub.dt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sub.dt.dao.IUserDao;
import com.sub.dt.pojo.User;
import com.sub.dt.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}

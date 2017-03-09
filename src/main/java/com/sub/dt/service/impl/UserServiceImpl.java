package com.sub.dt.service.impl;

import com.sub.dt.dao.IUserDao;
import com.sub.dt.dbRouting.annotation.Router;
import com.sub.dt.pojo.User;
import com.sub.dt.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	public int insertUser(User user) {
		return this.userDao.insertUser(user);
	}

	public int deleteByuserNum(String userNum) {
		return this.userDao.deleteByuserNum(userNum);
	}

	public int updateByUserNum(User user) {
		return this.userDao.updateByUserNum(user);
	}

	@Router
	public User selectByUserNum(User user) {
		return this.userDao.selectByUserNum(user);
	}
}

package com.sub.dt.service.impl;

import javax.annotation.Resource;

import com.sub.dt.dbRouting.annotation.Router;
import com.sub.dt.vo.UserVo;
import org.springframework.stereotype.Service;

import com.sub.dt.dao.IUserDao;
import com.sub.dt.pojo.User;
import com.sub.dt.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	@Router
	@Override
	public User getUserById(UserVo userVo) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userVo.getId());
	}
}

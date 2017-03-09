package com.sub.dt.service;

import com.sub.dt.pojo.User;
import com.sub.dt.vo.UserVo;

public interface IUserService {
	public User getUserById(int userId,UserVo userVo);
}

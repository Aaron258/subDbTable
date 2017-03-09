package com.sub.dt.service;

import com.sub.dt.dbRouting.annotation.Router;
import com.sub.dt.pojo.User;
import com.sub.dt.vo.UserVo;

public interface IUserService {

	public User selectByUserNum(UserVo userVo);
}

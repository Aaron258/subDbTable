package com.sub.dt.service;

import com.sub.dt.pojo.User;

/**
 * @Description
 * @Autohr supers【weChat:13031016567】
 */
public interface IUserService {

	/**
	 * @Description
	 * @Autohr supers【weChat:13031016567】
	 */
	public int insertUser(User user);

	/**
	 * @Description
	 * @Autohr supers【weChat:13031016567】
	 */
	public int deleteByuserNum(User user);

	/**
	 * @Description
	 * @Autohr supers【weChat:13031016567】
	 */
	public int updateByUserNum(User user);

	/**
	 * @Description
	 * @Autohr supers【weChat:13031016567】
	 */
	public User selectByUserNum(User user);


}

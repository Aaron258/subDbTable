package com.sub.dt.dao;

import com.sub.dt.pojo.User;

public interface IUserDao {

    /**
     * @Description
     * @Autohr supers【weChat:13031016567】
     */
    int insertUser(User user);

    /**
     * @Description
     * @Autohr supers【weChat:13031016567】
     */
    int deleteByuserNum(User user);

    /**
     * @Description
     * @Autohr supers【weChat:13031016567】
     */
    int updateByUserNum(User user);

    /**
     * @Description
     * @Autohr supers【weChat:13031016567】
     */
    User selectByUserNum(User user);
}
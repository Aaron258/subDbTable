package com.sub.dt.dao;

import com.sub.dt.pojo.User;

public interface IUserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByUserNum(User user);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
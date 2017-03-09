package com.sub.dt.service;

import com.sub.common.GsonUtils;
import com.sub.dt.dbRouting.DbContextHolder;
import com.sub.dt.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by supers on 2017/3/9.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class TestUserService {

    @Autowired
    private IUserService userService;

    /**
     * @Description 测试分库分表插入
     * @Autohr supers【weChat:13031016567】
     */
    @Test
    public void testInsertUser(){
        DbContextHolder.setTableIndex("_0003");
        User user = new User();
        user.setId(1);
        user.setUserNum("3");
        User userDb = userService.selectByUserNum(user);
    }

    /**
     * @Description 测试分库分表查询
     * @Autohr supers【weChat:13031016567】
     */
    @Test
    public void testQueryUserByNum(){
        User user = new User();
        user.setId(1);
        user.setUserNum("3");
        User userDb = userService.selectByUserNum(user);
        DbContextHolder.getDbKey();
        DbContextHolder.getTableIndex();
        System.out.println(DbContextHolder.getDbKey()+"库 "+DbContextHolder.getTableIndex()+"表 的查询结果:"+GsonUtils.toJson(userDb));
    }
}

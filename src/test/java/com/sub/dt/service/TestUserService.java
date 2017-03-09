package com.sub.dt.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangshupeng1 on 2017/3/9.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class TestUserService {

    @Autowired
    private IUserService userService;

    @Test
    public void testQueryUserByNum(){

    }
}

package com.sub.dt.vo;

import com.sub.dt.dbRouting.BaseDomain;

/**
 * Created by wangshupeng1 on 2017/3/9.
 */
public class UserVo extends BaseDomain {

    private int id;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

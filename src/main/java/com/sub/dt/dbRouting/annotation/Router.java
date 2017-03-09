package com.sub.dt.dbRouting.annotation;

/**
 * Created by wangshupeng1 on 2017/3/9.
 */
public @interface Router {

    String routerField() default RouterConstants.ROUTER_FIELD_DEFAULT;

    String tableStyle() default RouterConstants.ROUTER_TABLE_SUFFIX_DEFAULT;
}

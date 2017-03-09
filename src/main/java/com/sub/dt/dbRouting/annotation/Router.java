package com.sub.dt.dbRouting.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by supers on 2017/3/9.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Router {

    String routerField() default RouterConstants.ROUTER_FIELD_DEFAULT;

    String tableStyle() default RouterConstants.ROUTER_TABLE_SUFFIX_DEFAULT;
}

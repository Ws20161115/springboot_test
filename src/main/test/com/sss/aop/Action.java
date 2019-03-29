package com.sss.aop;

import java.lang.annotation.*;

/**
 * @ClassName Action
 * @Desprition @interface注解定义的语法
 * @Author shishanshan
 * @Date 2019/3/15 15:38
 * @Version 1.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public  @interface Action {
    String name();
}

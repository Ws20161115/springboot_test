package com.sss.aop;

import org.springframework.stereotype.Service;

/**
 * @ClassName DemoAnnotationService
 * @Desprition 使用注解的被拦截类
 * @Author shishanshan
 * @Date 2019/3/15 16:02
 * @Version 1.0
 **/
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add操作")
    public void  add(){
        //System.out.println("注解式被拦截");
    }
}

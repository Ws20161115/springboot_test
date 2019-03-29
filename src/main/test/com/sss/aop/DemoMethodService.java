package com.sss.aop;

import org.springframework.stereotype.Service;

/**
 * @ClassName DemoMethodService
 * @Desprition 使用方法规则被拦截的类
 * @Author shishanshan
 * @Date 2019/3/15 16:07
 * @Version 1.0
 **/
@Service
public class DemoMethodService {
    public void add(){
        //System.out.println("方法式被拦截");
    }
}

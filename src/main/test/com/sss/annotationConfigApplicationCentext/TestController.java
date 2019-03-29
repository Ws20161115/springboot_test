package com.sss.annotationConfigApplicationCentext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TestController
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/15 11:56
 * @Version 1.0
 **/
public class TestController {
    public static void main(String[] args) {
        //使用annotationConfigApplicationContext作为spring的容器 参数为一个配置类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        //获取声明配置的YseUseFunctionServicer
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("测试成功"));
        context.close();
    }
}

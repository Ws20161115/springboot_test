package com.sss;

import com.sss.aop.AopConfig;
import com.sss.aop.DemoAnnotationService;
import com.sss.aop.DemoMethodService;
import com.sss.aware.AwareConfig;
import com.sss.aware.AwareService;
import com.sss.el.ElConfig;
import com.sss.javaConfig.JavaConfig;
import com.sss.javaConfig.UseFunctionService;
import com.sss.taskexecutor.AsyncTaskService;
import com.sss.taskexecutor.TaskConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName test
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/15 13:48
 * @Version 1.0
 **/
public class test {
    //测试 javaConfig配置
    @Test
    public void testJavaConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("JavaConfig"));
        context.close();
    }
    //测试AOP
    @Test
    public void aopConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
    //测试spring-el表达式
    @Test
    public void ELConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig bean = context.getBean(ElConfig.class);
        bean.outputResource();
        context.close();
    }
    //测试Spring aware
    @Test
    public void AwareConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService bean = context.getBean(AwareService.class);
        bean.outputResult();
        context.close();
    }
    //测试Spring aware
    @Test
    public void AsyncTaskConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskConfig.class);
        AsyncTaskService bean = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            bean.executeAsyncTask(i);
            bean.executeAsyncTaskPlus(i);
        }
        System.out.println("执行完毕");
        context.close();
    }
}

package com.sss.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @ClassName TaskConfig
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/27 12:40
 * @Version 1.0
 **/
@Configuration
@ComponentScan("com.sss.taskexecutor")
@EnableAsync //利用@#EnableAsync 开启异步任务支持
//配置类实现AsyncConfigurer接口并重写里面的getAsyncExecutor方法,并返回一个ThreadPoolTaskExecutor,这样我们就获得一个基于线程池的taskExecutor
public class TaskConfig implements AsyncConfigurer{

    //通过async注解表明该方法是一个异步的方法,如果注解在类级别上,则表明该类的所有方法都是异步的,而这里的方法自动被注入使用ThreadPoolTaskExecutor作为
    //TaskExecutor
    @Async
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(11);
        threadPoolTaskExecutor.setMaxPoolSize(11);
        threadPoolTaskExecutor.setQueueCapacity(25);
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}

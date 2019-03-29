package com.sss.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName AopConfig
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/15 16:36
 * @Version 1.0
 **/
@Configuration
@ComponentScan("com.sss.sop")
@EnableAspectJAutoProxy//使用@enableAspectJAutoProxy注解开启Spring对AspectJ的支持
public class AopConfig {
}

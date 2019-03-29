package com.sss.annotationConfigApplicationCentext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName DiConfig
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/15 12:09
 * @Version 1.0
 **/
@Configuration//声明这是一个配置类
//自动扫描报下 带有@controller @service @repository @component注解的类  并且注册为bean
@ComponentScan("com.sss.annotationConfigApplicationCentext")//
public class DiConfig {

}

package com.sss.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @ClassName ElConfig
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/26 12:59
 * @Version 1.0
 **/
@Configuration
@ComponentScan("com.sss.el")
//
@PropertySource("classpath:/test.properties")
public class ElConfig {
    //注入普通字符串
    @Value("naomal")
    private String normal;
    //注入系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;
    //注入表达式结果
    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomNumber;
    //注入其他bean属性
    @Value("#{demoService.name}")
    private String fromName;
    //注入文件子软
    @Value("classpath:/test.properties")
    private Resource testFile;
    //注入网址资源
    @Value("http://www.baidu.com")
    private Resource testUrl;
    //注入配置文件
    @Value("${my.son.name}")
    private String name;

    @Autowired
    private Environment environment;

    @Bean
    public  static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return  new PropertySourcesPlaceholderConfigurer();
    }

    public  void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromName);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(name);
            System.out.println(environment.getProperty("my.name"));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

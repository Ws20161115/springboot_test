package com.sss.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName JavaConfig
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/15 13:48
 * @Version 1.0
 **/
//使用Configuration表示当前是一个配置类
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return  new FunctionService();
    }
    @Bean
    public  UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }
   /* @Bean
    public  UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }*/
}

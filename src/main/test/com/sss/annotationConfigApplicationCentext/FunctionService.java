package com.sss.annotationConfigApplicationCentext;

import org.springframework.stereotype.Service;

/**
 * @ClassName FunctionService
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/15 12:05
 * @Version 1.0
 **/
@Service
public class FunctionService {

    public String sayHello(String hello){
        return "Hello" +hello+"!";
    }
}

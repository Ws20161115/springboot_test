package com.sss.annotationConfigApplicationCentext;

import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

/**
 * @ClassName UseFunctionService
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/15 12:06
 * @Version 1.0
 **/
@Controller
public class UseFunctionService {
    @Resource
    private FunctionService functionService;

    public  String sayHello(String word){
        return functionService.sayHello(word);
    }
}

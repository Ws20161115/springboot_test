package com.sss.javaConfig;

/**
 * @ClassName UseFunctionService
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/15 13:45
 * @Version 1.0
 **/
public class UseFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
    public  String sayHello(String world){
        return functionService.sayHelloJavaConfig(world);
    }
}

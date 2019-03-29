package com.sss.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName DemoService
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/26 12:57
 * @Version 1.0
 **/
@Service
public class DemoService {
    @Value("初始化Name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

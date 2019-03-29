package com.example.springboot_test.controller;

import com.example.springboot_test.domain.User;
import com.example.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName IndexController
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2018/12/24 17:21
 * @Version 1.0
 **/
@Controller
public class IndexController {
    @Resource
    private UserService userService;
    @Value("${sss.name}")
    private String name;
    @Value("${sss.password}")
    private String password;

    @RequestMapping(value = "/getIndex/{username}/{password}")
    public String getIndex(@PathVariable String username,@PathVariable String password){
        System.out.println(username);
        System.out.println(password);
        return  "index";
    }
    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUser(){
        System.out.println(name);
        System.out.println(password);
        List<User> users = userService.selectAll();
        return users;
    }
}

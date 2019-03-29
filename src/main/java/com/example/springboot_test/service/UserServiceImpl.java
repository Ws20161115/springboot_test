package com.example.springboot_test.service;

import com.example.springboot_test.dao.UserMapper;
import com.example.springboot_test.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2018/12/25 11:48
 * @Version 1.0
 **/
@Service("userService")
public class UserServiceImpl implements  UserService{
    @Resource
    private UserMapper userMapper;
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}

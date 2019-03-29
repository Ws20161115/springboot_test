package com.example.springboot_test.service;

import com.example.springboot_test.domain.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();
}

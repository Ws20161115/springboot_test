package com.example.springboot_test.dao;

import com.example.springboot_test.domain.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @ResultMap("BaseResultMap")
    @Select("select * from n_user")
    List<User> selectAll();
}

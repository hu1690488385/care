package com.lanou.care.service;

import com.lanou.care.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    //注册用户信息
    public int addUser(User user);
    public User findUser(String phone);
    public List<User> findAll();
    public int deleteUser(Integer id);
}

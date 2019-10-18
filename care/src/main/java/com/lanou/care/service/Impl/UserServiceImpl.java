package com.lanou.care.service.Impl;

import com.lanou.care.bean.User;
import com.lanou.care.mapper.UserMapper;
import com.lanou.care.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
 @Autowired
 private UserMapper userMapper;
    @Override
    public User findUser(String phone, Integer password) {
        return userMapper.findUser(phone,password);
    }
}

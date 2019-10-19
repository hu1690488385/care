package com.lanou.care.service.Impl;

import com.lanou.care.bean.User;
import com.lanou.care.mapper.UserMapper;
import com.lanou.care.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
=======
@Service("userService")
public class UserServiceImpl implements UserService {
 @Autowired
 private UserMapper userMapper;
    @Override
    public User findUser(String phone) {
        return userMapper.findUser(phone);
>>>>>>> 3800ab2c61b63836189d27f2be72e78273afca70
    }
}

package com.lanou.care.service.Impl;

import com.lanou.care.bean.User;
import com.lanou.care.mapper.UserMapper;
import com.lanou.care.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(String phone) {
        return userMapper.findUser(phone);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int updateUser(String password,Integer empid,Integer id) {
        return userMapper.updateUser(password,empid,id);
    }


    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User passLogin(String phone, String pass) {
        return userMapper.passLogin(phone, pass);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }


}

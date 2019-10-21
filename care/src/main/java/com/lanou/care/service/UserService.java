package com.lanou.care.service;

import com.lanou.care.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    //注册用户信息
    public int addUser(User user);
    public User findUser(String phone);
    public List<User> findAll();
    public int updateUser(String password,Integer empid,Integer id);
    public int deleteUser(Integer id);
<<<<<<< HEAD
    //手机号密码登录
    public User passLogin(String phone,String pass);
=======
>>>>>>> 89f04230deac7cee8f8485c880754967ec2dc8d5
}

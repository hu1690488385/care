package com.lanou.care.service;

import com.lanou.care.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    //注册用户信息
    public int addUser(User user);
    public User findUser(String phone);
<<<<<<< HEAD
    public List<User> findAll();
    public int deleteUser(Integer id);
=======
>>>>>>> 49f99ccec38c55098eeb8f2a0f8e7447fac7aa8a
}

package com.lanou.care.service;

import com.lanou.care.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    public User findUser(@Param("phone") String phone, @Param("password") Integer password);
}

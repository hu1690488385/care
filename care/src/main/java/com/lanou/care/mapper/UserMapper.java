package com.lanou.care.mapper;

import com.lanou.care.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    //注册用户信息
    public int addUser(@Param("u") User user);
    public User findUser(@Param("phone") String phone);
    public List<User> findAll();
    public int deleteUser(Integer id);
    //手机号密码登录
    public User passLogin(@Param("phone") String phone,@Param("pass") String pass);
}

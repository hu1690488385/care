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
    //根据empid查询所有用户
    public List<User> findAll();
    public int updateUser(@Param("password") String password,@Param("empid")Integer empid,@Param("id") Integer id);
    public int deleteUser(Integer id);
}

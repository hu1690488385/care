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
<<<<<<< HEAD
=======
    //根据empid查询所有用户
>>>>>>> 89f04230deac7cee8f8485c880754967ec2dc8d5
    public List<User> findAll();
    public int updateUser(@Param("password") String password,@Param("empid")Integer empid,@Param("id") Integer id);
    public int deleteUser(Integer id);
<<<<<<< HEAD
    //手机号密码登录
    public User passLogin(@Param("phone") String phone,@Param("pass") String pass);
=======
>>>>>>> 89f04230deac7cee8f8485c880754967ec2dc8d5
}

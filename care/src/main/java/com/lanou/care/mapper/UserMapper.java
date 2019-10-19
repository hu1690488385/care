package com.lanou.care.mapper;

import com.lanou.care.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
<<<<<<< HEAD

@Mapper
@Component
public interface UserMapper {
    //注册用户信息
    public int addUser(@Param("u") User user);
=======
@Mapper
@Component
public interface UserMapper {
    public User findUser(@Param("phone") String phone);
>>>>>>> 3800ab2c61b63836189d27f2be72e78273afca70
}

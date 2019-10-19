package com.lanou.care.mapper;

import com.lanou.care.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
<<<<<<< HEAD

import java.util.List;
=======
>>>>>>> 49f99ccec38c55098eeb8f2a0f8e7447fac7aa8a

@Mapper
@Component
public interface UserMapper {
    //注册用户信息
    public int addUser(@Param("u") User user);
    public User findUser(@Param("phone") String phone);
<<<<<<< HEAD
    //根据empid查询所有用户
    public List<User> findAll();
    public int deleteUser(Integer id);
=======
>>>>>>> 49f99ccec38c55098eeb8f2a0f8e7447fac7aa8a
}

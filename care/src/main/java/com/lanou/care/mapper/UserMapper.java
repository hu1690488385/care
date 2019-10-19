package com.lanou.care.mapper;

import com.lanou.care.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Mapper
@Component
public interface UserMapper {
    public User findUser(@Param("phone") String phone);
}

package com.lanou.care.controller;

<<<<<<< HEAD
import com.lanou.care.bean.User;
import com.lanou.care.service.UserService;
import com.lanou.care.util.StringRandom;
import org.springframework.beans.factory.annotation.Autowired;
=======
import com.alibaba.fastjson.JSON;
import com.lanou.care.bean.User;
import com.lanou.care.mapper.UserMapper;
import com.lanou.care.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
>>>>>>> 3800ab2c61b63836189d27f2be72e78273afca70
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
<<<<<<< HEAD
    @Autowired
    private StringRandom random;
    @RequestMapping("addUser")
    public String adduser(User user){
        user.setPrssword(random.getStringRandom(8));
        int i = userService.addUser(user);
        return "";
=======

    @RequestMapping("login")
    public String loginUser(String username, String auth) {
        String msg = "";
        if (username != null && !username.equals("") && auth != null && !auth.equals("")) {
            if (true) {
                User user = userService.findUser(username);
                if (user != null) {
                   msg="six";
                } else {
                    msg = "用户不存在";
                }
            }else {
                msg="验证码不正确";
            }
        }
        return JSON.toJSONString(msg);
>>>>>>> 3800ab2c61b63836189d27f2be72e78273afca70
    }
}

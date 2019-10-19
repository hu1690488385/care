package com.lanou.care.controller;

import com.alibaba.fastjson.JSON;
import com.lanou.care.bean.User;
import com.lanou.care.mapper.UserMapper;
import com.lanou.care.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

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
    }
}

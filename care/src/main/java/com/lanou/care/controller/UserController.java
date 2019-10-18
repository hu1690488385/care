package com.lanou.care.controller;

import com.lanou.care.mapper.UserMapper;
import com.lanou.care.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("emp")
public class UserController {
@Autowired
    private UserService userService;
@RequestMapping("login")
@Cacheable("userAll")
    public  String loginUser(HttpServletRequest request, HttpServletResponse response){

    return "";
}
}

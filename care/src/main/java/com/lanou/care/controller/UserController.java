package com.lanou.care.controller;

import com.lanou.care.bean.User;
import com.lanou.care.service.UserService;
import com.lanou.care.util.StringRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private StringRandom random;
    @RequestMapping("addUser")
    public String adduser(User user){
        user.setPrssword(random.getStringRandom(8));
        int i = userService.addUser(user);
        return "";
    }
}

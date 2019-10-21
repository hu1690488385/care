package com.lanou.care.controller;
import com.lanou.care.bean.Emp;
import com.lanou.care.bean.User;
import com.lanou.care.service.EmpService;
import com.lanou.care.service.UserService;
import com.lanou.care.util.SendSms;
import com.lanou.care.util.StringRandom;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSON;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private StringRandom random;
    @Autowired
    private EmpService empService;
    @Autowired
    private User user;
    @Autowired
    private SendSms sendSms;
    String getAuth = ""; //验证码

    @RequestMapping("addUser")
    public String adduser(String phone, String auth, String empId) {
        String msg = "";
        if (phone != null && !phone.equals("") && auth != null && !auth.equals("") && empId != null && !empId.equals("")) {
            if (auth.equals(getAuth)) {
                User u = userService.findUser(phone);
                if (u == null) {
                    user.setPhone(phone);
                    user.setEmpId(Integer.parseInt(empId));
                    user.setPassword(random.getStringRandom(8));
                    msg = String.valueOf(userService.addUser(user));
                } else {
                    msg = phone + "已存在";
                }
            } else {
                msg = "验证码错误";
            }
        } else {
            msg = "账户或验证码或职位为空";
        }
        return JSON.toJSONString(msg);
    }

    @RequestMapping("getAuth")
    /*@Cacheable(value = "auth")*/
    public String getAuth(String phone) {
        getAuth = random.getAuth();
        /* String bbc = sendSms.getAuth(phone,getAuth);*/
        return JSON.toJSONString(getAuth);
    }

    @RequestMapping("login")
    public String loginUser(String username, String auth) {
        String msg = "";
        if (username != null && !username.equals("") && auth != null && !auth.equals("")) {
            if (auth.equals(getAuth)) {
                User user = userService.findUser(username);
                if (user != null) {
                    msg = "six";
                } else {
                    msg = "用户不存在";
                }
            } else {
                msg = "验证码不正确";
            }
        }
        return JSON.toJSONString(msg);
    }

    @RequestMapping("findAll")
    public String findAll() {
        List<User> userList = userService.findAll();
        return JSON.toJSONString(userList);
    }

    @RequestMapping("deleteUser")
    public String deleteUser(HttpServletRequest request) {
        String id = request.getParameter("id");
        int aa = userService.deleteUser(Integer.parseInt(id));
        return "emp.html";
    }


    /*账号密码登录*/
    @RequestMapping("passlogin")
    public String passLogin(String phone, String pass) {
        String msg = "";
        if (phone != null && !phone.equals("") && pass != null && !pass.equals("")) {
            User user = userService.findUser(phone);
            if (user == null) {
                msg = "账户不存在";
            } else {
                if (user.getPassword().equals(pass)) {
                    msg = "six";
                } else {
                    msg = "密码错误";
                }
            }

        } else {
            msg = "账号或者密码为空";
        }
        return JSON.toJSONString(msg);
    }

    @RequestMapping("updateUser")
    public String updateUser(String id){
        Map map = new HashMap();
        User user=userService.findUser(id);
        List<Emp> emps = empService.findAllEmp();
        map.put("user",user);
        map.put("emps",emps);
        return JSON.toJSONString(map);

    }
}


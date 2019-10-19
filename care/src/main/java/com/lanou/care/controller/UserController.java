package com.lanou.care.controller;
<<<<<<< HEAD
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
=======

>>>>>>> 49f99ccec38c55098eeb8f2a0f8e7447fac7aa8a
import com.lanou.care.bean.User;
import com.lanou.care.service.UserService;
import com.lanou.care.util.SendSms;
import com.lanou.care.util.StringRandom;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSON;
<<<<<<< HEAD
import com.lanou.care.bean.User;
import com.lanou.care.mapper.UserMapper;
import com.lanou.care.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

>>>>>>> 49f99ccec38c55098eeb8f2a0f8e7447fac7aa8a
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
<<<<<<< HEAD

    @Autowired
    private StringRandom random;

    @RequestMapping("addUser")
    public String adduser(User user) {
        user.setPrssword(random.getStringRandom(8));
        int i = userService.addUser(user);
        return "";
    }

=======
    @Autowired
    private StringRandom random;
    @Autowired
    private User user;
    @Autowired
    private SendSms sendSms;
    String getAuth = ""; //验证码
    @RequestMapping("addUser")
    public String adduser(String phone, String auth,String empId) {
        String msg = "";
        if (phone != null && !phone.equals("") && auth != null && !auth.equals("") && empId !=null && !empId.equals("")) {
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
            }else {
                msg = "验证码错误";
            }
        }else {
            msg = "账户或验证码或职位为空";
        }
        return JSON.toJSONString(msg);
    }
    @RequestMapping("getAuth")
    public String getAuth(String phone){
        getAuth = random.getAuth();
        /* String bbc = sendSms.getAuth(phone,getAuth);*/
         return JSON.toJSONString(getAuth);
    }
>>>>>>> 49f99ccec38c55098eeb8f2a0f8e7447fac7aa8a
    @RequestMapping("login")
    public String loginUser(String username, String auth) {
        String msg = "";
        if (username != null && !username.equals("") && auth != null && !auth.equals("")) {
            if (true) {
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
    public String findAll(){
        List<User> userList = userService.findAll();
        return JSON.toJSONString(userList);
    }
    @RequestMapping("deleteUser")
    public String deleteUser(HttpServletRequest request){
        String id=request.getParameter("id");
        int aa= userService.deleteUser(Integer.parseInt(id));
        return "emp.html";
    }
   /* @RequestMapping("sms")
    public String SMS(String username) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", username);
        request.putQueryParameter("SignName", "王者荣耀开发部");
        request.putQueryParameter("TemplateCode", "SMS_175532071");
        request.putQueryParameter("TemplateParam", "{\"code\":\"+"+random.getAuth()+"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return "";
    }*/
}


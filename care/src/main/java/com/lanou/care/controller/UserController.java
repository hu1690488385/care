package com.lanou.care.controller;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.lanou.care.bean.User;
import com.lanou.care.service.UserService;
import com.lanou.care.util.StringRandom;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
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
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private StringRandom random;

    @RequestMapping("addUser")
    public String adduser(User user) {
        user.setPrssword(random.getStringRandom(8));
        int i = userService.addUser(user);
        return "";
    }

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


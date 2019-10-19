package com.lanou.care.util;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class StringRandom {
    //生成随机数字和字母
    public String getStringRandom(int length) {
        Random random = new Random();
        String val = "";
        //参数length，表示生成几位随机数
        for (int i = 0; i < length; i++) {

            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
            //输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)) {
                //输出是大写字母还是小写字母
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                val += (char) (random.nextInt(26) + temp);
            } else if ("num".equalsIgnoreCase(charOrNum)) {
                val += String.valueOf(random.nextInt(10));
            }
        }
        return val;
    }
    //随机验证码
    public String getAuth(){
        Random random = new Random();
        String auth = "";
        for (int i = 0; i < 4; i++){
            auth += String.valueOf(random.nextInt(10));
        }
        return auth;
    }

}

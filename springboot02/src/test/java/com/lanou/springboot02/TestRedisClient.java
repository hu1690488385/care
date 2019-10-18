package com.lanou.springboot02;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import javax.sound.sampled.Port;
import java.util.List;
import java.util.Set;

public class TestRedisClient {
    @Test
    public void testConnection(){
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.auth("root");
        System.out.println(jedis.ping());
        //新增string
        jedis.set("school","河南应用技术职业学院");
        //删除string
        System.out.println(jedis.get("school"));
    }
/* 操作lpush*/
    @Test
    public void testList(){
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.auth("root");
        System.out.println(jedis.ping());
        //新增列表
        jedis.lpush("手机","ipone");
        jedis.lpush("手机","oppo");
        jedis.lpush("手机","vivo");
        //取出
         List<String> list=jedis.lrange("手机",0,jedis.llen("手机"));
         for (String s: list){
             System.out.println(s);
         }
    }
    /* 操作hash*/
    @Test
    public void testHash(){
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.auth("root");
        //取出所有的Key
        Set set = jedis.keys("*");
        for (Object o : set){
            System.out.println(o +"*******"+jedis.type(o.toString()));
        }
       /* jedis.hset("user","id","10001");
        jedis.hset("user","username","小龙");

        System.out.println(jedis.hget("user","id"));
        System.out.println(jedis.hgetAll("user"));*/
    }
}

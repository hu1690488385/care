package com.lanou.care;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CareApplication.class, args);
    }

}

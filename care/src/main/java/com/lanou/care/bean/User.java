package com.lanou.care.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Component
public class User {
    private Integer id;
    private String phone;
    private String prssword;
    private int rmp_id;
}

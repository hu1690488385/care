package com.lanou.care.controller;

import com.alibaba.fastjson.JSON;
import com.lanou.care.bean.Emp;
import com.lanou.care.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("findAllEmp")
    public String findAllEmp(){
        List<Emp> empList = empService.findAllEmp();
        return JSON.toJSONString(empList);
    }
}

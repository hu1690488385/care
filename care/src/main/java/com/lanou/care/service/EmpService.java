package com.lanou.care.service;

import com.lanou.care.bean.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpService {
    //查询所有职位
    public List<Emp> findAllEmp();
    public int updateEmp(String ename,Integer id);
    public Emp findEmp(Integer id);
}

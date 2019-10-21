package com.lanou.care.mapper;

import com.lanou.care.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> 89f04230deac7cee8f8485c880754967ec2dc8d5
@Mapper
@Component
public interface EmpMapper {
    //查询所有职位
    public List<Emp> findAllEmp();
    public int updateEmp(@Param("ename") String ename,@Param("id") Integer id);
    public Emp findEmp(@Param("id") Integer id);
}

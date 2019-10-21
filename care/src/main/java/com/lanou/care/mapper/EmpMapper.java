package com.lanou.care.mapper;

import com.lanou.care.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface EmpMapper {
    //查询所有职位
    public List<Emp> findAllEmp();
    public int updateEmp(@Param("ename") String ename,@Param("id") Integer id);
    public Emp findEmp(@Param("id") Integer id);
}

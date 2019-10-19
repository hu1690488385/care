package com.lanou.care.mapper;

import com.lanou.care.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
@Mapper
@Component
public interface EmpMapper {
    //查询所有职位
    public List<Emp> findAllEmp();
}

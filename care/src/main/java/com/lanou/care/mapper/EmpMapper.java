package com.lanou.care.mapper;

import com.lanou.care.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
<<<<<<< HEAD
=======
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
>>>>>>> 49f99ccec38c55098eeb8f2a0f8e7447fac7aa8a
@Mapper
@Component
public interface EmpMapper {
    //查询所有职位
    public List<Emp> findAllEmp();
}

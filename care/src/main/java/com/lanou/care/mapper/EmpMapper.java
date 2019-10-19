package com.lanou.care.mapper;

<<<<<<< HEAD
import com.lanou.care.bean.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
=======
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
>>>>>>> 3800ab2c61b63836189d27f2be72e78273afca70
@Mapper
@Component
public interface EmpMapper {
    //查询所有职位
    public List<Emp> findAllEmp();
}

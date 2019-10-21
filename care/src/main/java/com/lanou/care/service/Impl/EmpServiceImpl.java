package com.lanou.care.service.Impl;

import com.lanou.care.bean.Emp;
import com.lanou.care.mapper.EmpMapper;
import com.lanou.care.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> findAllEmp() {
        return empMapper.findAllEmp();
    }

    @Override
    public int updateEmp(String ename, Integer id) {
        return empMapper.updateEmp(ename,id);
    }

    @Override
    public Emp findEmp(Integer id) {
        return empMapper.findEmp(id);
    }

}

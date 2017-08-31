package com.hsd.dao.wagecalculation;

import com.hsd.entity.wagecalculation.EmployeeSalary;
import com.hsd.entity.wagecalculation.EmployeeSalaryExample;
import java.util.List;

public interface EmployeeSalaryMapper {
    int deleteByPrimaryKey(String id);

    int insert(EmployeeSalary record);

    int insertSelective(EmployeeSalary record);

    List<EmployeeSalary> selectByExample(EmployeeSalaryExample example);

    EmployeeSalary selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EmployeeSalary record);

    int updateByPrimaryKey(EmployeeSalary record);
}
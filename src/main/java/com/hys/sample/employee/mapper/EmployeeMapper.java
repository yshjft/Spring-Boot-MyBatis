package com.hys.sample.employee.mapper;


import com.hys.sample.employee.model.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Department> selectDepartmentList();
}

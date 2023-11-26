package com.hys.sample.employee.service;

import com.hys.sample.employee.model.Department;
import com.hys.sample.employee.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeMapper employeeMapper;

    public List<Department> getDepartmentList() {
        return employeeMapper.selectDepartmentList();
    }
}

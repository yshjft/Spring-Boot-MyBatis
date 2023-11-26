package com.hys.sample.employee.dto;

import com.hys.sample.employee.model.Department;

import java.util.List;

public record DepartmentsResponse (String message, List<Department> departmentList){
}

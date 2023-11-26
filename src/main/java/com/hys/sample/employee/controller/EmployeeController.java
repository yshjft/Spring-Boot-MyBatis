package com.hys.sample.employee.controller;

import com.hys.sample.employee.dto.DepartmentsResponse;
import com.hys.sample.employee.model.Department;
import com.hys.sample.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sample/employees")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<DepartmentsResponse> getDepartmentList() {
        List<Department> departmentList = employeeService.getDepartmentList();
        return ResponseEntity.ok(new DepartmentsResponse("SUCCESS", departmentList));
    }
}

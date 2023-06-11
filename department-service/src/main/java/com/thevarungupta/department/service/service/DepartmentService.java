package com.thevarungupta.department.service.service;

import com.thevarungupta.department.service.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartment();
    Department getDepartmentById(Long id);
    Department createDepartment(Department department);
}

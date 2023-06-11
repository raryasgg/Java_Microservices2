package com.thevarungupta.department.service.controller;

import com.thevarungupta.department.service.entity.Department;
import com.thevarungupta.department.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartment();
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        return departmentService.getDepartmentById(id);
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }
}

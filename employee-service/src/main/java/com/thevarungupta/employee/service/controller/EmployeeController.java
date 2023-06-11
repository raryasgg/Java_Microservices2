package com.thevarungupta.employee.service.controller;

import com.thevarungupta.employee.service.dto.EmployeeDepartment;
import com.thevarungupta.employee.service.entity.Employee;
import com.thevarungupta.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/employees")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{id}/department")
    public EmployeeDepartment getEmployeeWithDepartment(@PathVariable("id") Long id){
        return employeeService.getEmployeeWithDepartment(id);
    }
}

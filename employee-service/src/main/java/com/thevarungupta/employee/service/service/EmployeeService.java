package com.thevarungupta.employee.service.service;

import com.thevarungupta.employee.service.dto.EmployeeDepartment;
import com.thevarungupta.employee.service.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee createEmployee(Employee employee);

    EmployeeDepartment getEmployeeWithDepartment(Long id);
}

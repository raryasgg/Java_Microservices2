package com.thevarungupta.employee.service.service.impl;

import com.thevarungupta.employee.service.dto.Department;
import com.thevarungupta.employee.service.dto.EmployeeDepartment;
import com.thevarungupta.employee.service.entity.Employee;
import com.thevarungupta.employee.service.repository.EmployeeRepository;
import com.thevarungupta.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeDepartment getEmployeeWithDepartment(Long id) {
        Employee employee = employeeRepository.findById(id).get();

        // department
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/api/departments/"+ employee.getDepartmentId(),
                Department.class);

        return new EmployeeDepartment(employee, department);
    }
}

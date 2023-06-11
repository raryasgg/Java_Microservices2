package com.thevarungupta.department.service.repository;

import com.thevarungupta.department.service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

package com.example.Employeemanagement.repository;

import com.example.Employeemanagement.EmployeemanagementApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository<employee> extends JpaRepository<employee,Long> {
}

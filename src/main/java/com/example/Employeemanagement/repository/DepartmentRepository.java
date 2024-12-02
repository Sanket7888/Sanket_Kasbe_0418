package com.example.Employeemanagement.repository;

import com.example.Employeemanagement.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Dept,Long> {
}

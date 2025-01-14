
package com.example.Employeemanagement.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "dept")

public class Dept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long DepartmentId;
    private String departmentName;

    private  boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private  LocalDateTime updatedDate;
}
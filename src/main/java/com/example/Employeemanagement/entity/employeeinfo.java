package com.example.Employeemanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name ="employeeinfo")

public class employeeinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String employeeName;
    private String email;
    private String name;
    private String address;
    private String date_of_joining;
    private Float salary;
}

package com.example.lab04_20206438.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private int employeeid;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name", nullable = false)
    private String lastname;
    @Column(name = "department_id")
    private String departmentid;
    @Column(name = "job_id", nullable = false)
    private String jobid;
    @Column(name = "salary")
    private double salary;
    @Column(name = "phone_number")
    private String phonenumber;



}

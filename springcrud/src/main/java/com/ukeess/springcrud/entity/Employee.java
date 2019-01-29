package com.ukeess.springcrud.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empID")
    private Integer empID;
    @Column(name = "empName")
    private String empName;
    @Column(name = "empActive")
    private boolean empActive;
    @ManyToOne
    private Department department;


    public Employee() {
    }

    public Employee(String empName, boolean empActive, Department department) {
        this.empName = empName;
        this.empActive = empActive;
        this.department = department;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public boolean isEmpActive() {
        return empActive;
    }

    public void setEmpActive(boolean empActive) {
        this.empActive = empActive;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

package com.ukeess.springcrud.dto;

import com.ukeess.springcrud.entity.Employee;
public class EmployeeDTO {

    private Integer empID;
    private String empName;
    private boolean empActive;
    private DepartmentDTO department;


    public EmployeeDTO() {
    }

    public EmployeeDTO(String empName, boolean empActive, DepartmentDTO department) {
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

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }
    public Employee convertToEmployee(){
        Employee emp = new Employee();
        if (empID!=null){
            emp.setEmpID(empID);
        }
        if(empName!=null){
            emp.setEmpName(empName);
        }
        emp.setEmpActive(empActive);
        if(department!=null){
            emp.setDepartment(department.convertToDepartment());
        }
        return emp;
    }
}

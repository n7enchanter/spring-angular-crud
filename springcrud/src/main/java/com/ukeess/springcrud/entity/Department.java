package com.ukeess.springcrud.entity;

import com.fasterxml.jackson.annotation.*;
import com.ukeess.springcrud.dto.DepartmentDTO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="Departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "depID")
    private Integer depID;
    @Column(name = "depName")
    private String depName;
    @JsonBackReference
    @OneToMany(cascade = CascadeType.REMOVE,mappedBy = "department")
    private List<Employee> employees;

    public Department() {
    }

    public Department(String depName) {
        this.depName = depName;

    }

    public Integer getDepID() {
        return depID;
    }

    public void setDepID(Integer depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public DepartmentDTO convertToDepartmentDTO(){
        DepartmentDTO depDTO = new DepartmentDTO();
        if(depID!=null){
            depDTO.setDepID(depID);
        }
        if(depName!=null){
            depDTO.setDepName(depName);
        }
        return depDTO;
    }
}

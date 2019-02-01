package com.ukeess.springcrud.dto;

import com.ukeess.springcrud.entity.Department;


public class DepartmentDTO {

    private Integer depID;
    private String depName;

    public DepartmentDTO() {
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

    public Department convertToDepartment(){
        Department dep = new Department();
        if(depID != null){
            dep.setDepID(depID);
        }
        if(depName!=null){
            dep.setDepName(depName);
        }
        return dep;
    }
}


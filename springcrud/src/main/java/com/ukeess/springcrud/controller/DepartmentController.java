package com.ukeess.springcrud.controller;

import com.ukeess.springcrud.entity.Department;
import com.ukeess.springcrud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;


    @GetMapping("departments")
    public List<DepartmentDTO> getDepartments(){
        return departmentService.findAll();
    }




}

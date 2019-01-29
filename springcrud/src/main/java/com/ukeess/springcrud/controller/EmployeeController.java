package com.ukeess.springcrud.controller;

import com.fasterxml.jackson.annotation.JsonValue;
import com.ukeess.springcrud.entity.Department;
import com.ukeess.springcrud.entity.Employee;
import com.ukeess.springcrud.service.DepartmentService;
import com.ukeess.springcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("employees/")
    public List<Employee> getEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("employee/{id}")
    public Optional<Employee> getById(@PathVariable("id") Integer id){
        return employeeService.getById(id);
    }

    @PostMapping(value = "employee/add")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
    }

    @DeleteMapping("employee/{id}")
    public void deleteEmployee(@PathVariable("id") Integer id){
        employeeService.deleteById(id);
    }

    @GetMapping(value = "employee/search/{name}")
    public List<Employee> searchByName(@PathVariable(value = "name") String empName){

        return  employeeService.searchByName(empName);
    }


}

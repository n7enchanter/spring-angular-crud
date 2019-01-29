package com.ukeess.springcrud.service;

import com.ukeess.springcrud.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    void saveAll(List<Employee> e);
    List<Employee> findAll();
    void save(Employee employee);
    void deleteById(Integer id);
    List<Employee> searchByName(String empName);
    Optional<Employee> getById(Integer id);
}

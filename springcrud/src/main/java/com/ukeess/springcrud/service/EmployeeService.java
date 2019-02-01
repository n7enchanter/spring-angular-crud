package com.ukeess.springcrud.service;

import com.ukeess.springcrud.dto.EmployeeDTO;
import com.ukeess.springcrud.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<EmployeeDTO> findAll();
    void save(EmployeeDTO employeeDTO);
    void deleteById(Integer id);
    List<EmployeeDTO> searchByName(String empName);
    EmployeeDTO getById(Integer id);
}

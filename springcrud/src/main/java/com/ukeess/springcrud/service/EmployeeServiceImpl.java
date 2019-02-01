package com.ukeess.springcrud.service;

import com.ukeess.springcrud.dao.EmployeeRepository;
import com.ukeess.springcrud.dto.EmployeeDTO;
import com.ukeess.springcrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void deleteById(Integer id){
        employeeRepository.deleteById(id);
    }

    public List<EmployeeDTO> searchByName(String empName){
        List<Employee> employees = employeeRepository.findAllByEmpNameStartsWith(empName);
        List<EmployeeDTO> employeeDTO = new ArrayList<>();
        for(Employee emp: employees){
            employeeDTO.add(emp.convertToEmployeeDTO());
        }
        return  employeeDTO;
    }
    @Override
    public List<EmployeeDTO> findAll() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDTO> employeeDTO = new ArrayList<>();
        for(Employee emp : employees){
            employeeDTO.add(emp.convertToEmployeeDTO());
        }
        return employeeDTO;
    }
    public void save(EmployeeDTO employeeDTO){
        employeeRepository.save(employeeDTO.convertToEmployee());
    }


    public EmployeeDTO getById(Integer id){
        return employeeRepository.findById(id).get().convertToEmployeeDTO();
    }
}

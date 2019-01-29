package com.ukeess.springcrud.service;

import com.ukeess.springcrud.dao.EmployeeRepository;
import com.ukeess.springcrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    @Override
    public void saveAll(List<Employee> e) {
        employeeRepository.saveAll(e);
    }
    @Transactional
    public void deleteById(Integer id){
        employeeRepository.deleteById(id);
    }

    public List<Employee> searchByName(String empName){
        return  employeeRepository.findAllByEmpNameStartsWith(empName);
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Optional<Employee> getById(Integer id){
        return employeeRepository.findById(id);
    }
}

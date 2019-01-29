package com.ukeess.springcrud.dao;

import com.ukeess.springcrud.entity.Department;
import com.ukeess.springcrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findAllByEmpNameStartsWith(String empName);

}

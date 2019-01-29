package com.ukeess.springcrud.service;

import com.ukeess.springcrud.dao.DepartmentRepository;
import com.ukeess.springcrud.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Transactional
    @Override
    public List<String> findAllName() {
         List<Department> ld = departmentRepository.findAll();
         List<String> depNames = new ArrayList<>();
         for(Department d : ld){
             depNames.add(d.getDepName());
         }
        return depNames;
    }
    @Transactional
    @Override
    public void saveDep(List<Department> d) {
        departmentRepository.saveAll(d);
    }

    public DepartmentServiceImpl() {
    }

    public DepartmentRepository getDepartmentRepository() {
        return departmentRepository;
    }

    public void setDepartmentRepository(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
}

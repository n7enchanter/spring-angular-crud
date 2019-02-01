package com.ukeess.springcrud.service;

import com.ukeess.springcrud.dao.DepartmentRepository;
import com.ukeess.springcrud.dto.DepartmentDTO;
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
    public List<DepartmentDTO> findAll() {
        List<Department> departments = departmentRepository.findAll();
        List<DepartmentDTO> departmentDTO = new ArrayList<>();
        for(Department dep : departments){
            departmentDTO.add(dep.convertToDepartmentDTO());
        }
        return departmentDTO;
    }



    public DepartmentServiceImpl() {
    }

}


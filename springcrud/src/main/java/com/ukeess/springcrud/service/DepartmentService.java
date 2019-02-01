package com.ukeess.springcrud.service;


import com.ukeess.springcrud.dto.DepartmentDTO;
import com.ukeess.springcrud.entity.Department;


import java.util.List;


public interface DepartmentService {
   List<DepartmentDTO>  findAll();

}

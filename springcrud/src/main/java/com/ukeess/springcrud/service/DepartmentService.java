package com.ukeess.springcrud.service;


import com.ukeess.springcrud.entity.Department;


import java.util.List;


public interface DepartmentService {
   List<Department> findAll();
   List<String> findAllName();
   void saveDep(List<Department> d);

}

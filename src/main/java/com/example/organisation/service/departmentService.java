package com.example.organisation.service;

import com.example.organisation.entity.department;

import java.util.List;

public interface departmentService {

    department saveDepartment(department department);

    department fetchDepartmentById(Long departmentId);

    List<department> fetchAllDepartments();

    void deleteDepartmentById(Long departmentId);
    

}

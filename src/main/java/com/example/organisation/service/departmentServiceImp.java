package com.example.organisation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.organisation.entity.department;
import com.example.organisation.repository.departmentRepository;

import io.micrometer.common.lang.NonNull;

import java.util.List;
import java.util.Optional;

@Service
public class departmentServiceImp implements departmentService {

    @Autowired
    private departmentRepository departmentRepository;

    @Override
    public department saveDepartment(@NonNull department department) {
        return departmentRepository.save(department);
    }

    @Override
    public department fetchDepartmentById(Long departmentId) {
        System.out.println("departmentId: " + departmentId);
        System.out.println("repository: " + departmentRepository.findById(departmentId));
        Optional<department> department = departmentRepository.findById(departmentId);
        department dept = department.get();
        System.out.println("departments: " + dept);
        if (department.isPresent()) {
            return department.get();
        }
        return null;
    }

    @Override
    public List<department> fetchAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        System.out.println("departmentId: " + departmentId);
        departmentRepository.deleteById( departmentId);
    }

}

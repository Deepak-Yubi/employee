package com.example.organisation.controller;


import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.organisation.entity.department;
import com.example.organisation.service.departmentService;

import java.util.List;

@RestController
public class departmentPage {

    @Autowired
    private departmentService departmentService;

    @PostMapping("/department")
    public department saveDepartment(@RequestBody department department) {
        System.out.println("department: " + department);
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department/{id}")
    public department fetchDepartmentById(@PathVariable Long id) {
        return departmentService.fetchDepartmentById(id);
    }

    @GetMapping("/departments")
    public List<department> fetchAllDepartments() {
        return departmentService.fetchAllDepartments();
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable Long id) {
        departmentService.deleteDepartmentById(id);
        return "Department deleted successfully";
    }
}

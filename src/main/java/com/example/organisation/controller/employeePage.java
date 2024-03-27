package com.example.organisation.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.organisation.entity.employee;
import com.example.organisation.service.employeeService;


import java.util.List;

@RestController
public class employeePage {

    @Autowired
    private employeeService employeeService;

    @PostMapping("/employee")
    public employee saveEmployee(@RequestBody employee employee) {
        System.out.println("employee: " + employee);
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee/{id}")
    public employee fetchEmployeeById(@PathVariable Long id) {
        return employeeService.fetchEmployeeById(id);
    }

    @GetMapping("/employees")
    public List<employee> fetchAllEmployees() {
        return employeeService.fetchAllEmployees();
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployeeById(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
        return "Employee deleted successfully";
    }

}

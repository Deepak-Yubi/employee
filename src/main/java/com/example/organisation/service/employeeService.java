package com.example.organisation.service;

// import org.springframework.stereotype.Service;

import com.example.organisation.entity.employee;

import java.util.List;

public interface employeeService {

    employee saveEmployee(employee employee);

    employee fetchEmployeeById(Long employeeId);

    List<employee> fetchAllEmployees();

    void deleteEmployeeById(Long employeeId);

}

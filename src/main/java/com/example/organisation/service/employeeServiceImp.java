package com.example.organisation.service;

import org.springframework.stereotype.Service;
import com.example.organisation.entity.employee;
import com.example.organisation.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class employeeServiceImp implements employeeService{

    @Autowired
    private employeeRepository employeeRepository;
    
        @Override
        public employee saveEmployee(employee employee) {
            System.out.println("employeesssss: " + employee);
            return employeeRepository.save(employee);
        }
    
        @Override
        public employee fetchEmployeeById(Long employeeId) {
            Optional<employee> employee = employeeRepository.findById(employeeId);
            if (employee.isPresent()) {
                return employee.get();
            }
            return null;
        }
    
        @Override
        public List<employee> fetchAllEmployees() {
            return employeeRepository.findAll();
        }
    
        @Override
        public void deleteEmployeeById(Long employeeId) {
            employeeRepository.deleteById(employeeId);

    
        }
}

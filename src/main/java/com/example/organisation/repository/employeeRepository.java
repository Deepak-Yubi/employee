package com.example.organisation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.organisation.entity.employee;

@Repository
public interface employeeRepository extends JpaRepository<employee,Long > {
    
}

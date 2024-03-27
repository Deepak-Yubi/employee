package com.example.organisation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.organisation.entity.department;

@Repository
public interface departmentRepository extends JpaRepository<department, Long> {

}

package com.example.organisation.entity;

import com.example.organisation.entity.department;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Column;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "employee")
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long employeeid;

    private String employee_name;


    private long department_id;

    @Temporal(TemporalType.DATE)
    private Date date_of_joining;

    private String status;

    private String designation;

    private String address;

    private int salary;

    public employee(long employeeId, String employeeName, Date dateOfJoining, String status,
            String designation, String address, int salary) {
        this.employeeid = employeeId;
        this.employee_name = employeeName;
        this.date_of_joining = dateOfJoining;
        this.status = status;
        this.designation = designation;
        this.address = address;
        this.salary = salary;

    }

}

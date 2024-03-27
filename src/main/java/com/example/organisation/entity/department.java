package com.example.organisation.entity;

import com.example.organisation.entity.employee;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "department", uniqueConstraints = @UniqueConstraint(columnNames = "departmentName"))
public class department {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentid;

    @NonNull
    private String departmentname;

    private employee departmenthead;

    private String departmentlocation;

    private int departmentsize;

    @OneToMany(targetEntity = employee.class, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="department_id", referencedColumnName = "departmentid")
    private List<employee> employees;



}

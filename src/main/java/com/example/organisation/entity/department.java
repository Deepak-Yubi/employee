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

import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;

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

    private String departmenthead;

    private String departmentlocation;

    private int departmentsize;

    @OneToMany(targetEntity = employee.class, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="department_id", referencedColumnName = "departmentid")
    @JdbcTypeCode(SqlTypes.JSON)
    private List<employee> employees = new ArrayList<>();



}

package com.example.organisation.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.*;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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

    public department(long departmentId, String departmentName, String departmentHead , String departmentLocation) {
        this.departmentid = departmentId;
        this.departmentname = departmentName;
        this.departmenthead = departmentHead;
        this.departmentlocation = departmentLocation;
    }




}

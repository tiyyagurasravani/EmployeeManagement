package com.employee.employee.respository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;
    @Column(name="firstName")
    public String firstName;
    @Column(name="lastName")
    private String lastName;
   @Column(name="department_id")
    private Integer department_id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
               CascadeType.DETACH,CascadeType.REFRESH},optional = false)
    @JoinColumn(name = "department_id",referencedColumnName = "id",insertable=false ,updatable=false,nullable=false)
    private Department department;

}
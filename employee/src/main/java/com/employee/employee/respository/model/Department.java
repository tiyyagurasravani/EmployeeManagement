package com.employee.employee.respository.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;



@Entity
@Table(name = "Department")
@Data
public class Department {
    @javax.persistence.Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name="departmentName")
    private String departmentName;

   @OneToMany(mappedBy = "department", cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    private List<Employee> Employees;

}

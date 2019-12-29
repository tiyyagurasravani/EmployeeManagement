package com.employee.employee.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class Employee {

    private Integer id;
    public String firstName;
    private String lastName;
    private Department department_id;
}
package com.employee.employee.model;

import lombok.Data;


import java.util.List;


@Data
public class Department {

    private Integer id;
    private String departmentName;

    private List<Employee> Employees;
}

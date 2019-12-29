package com.employee.employee.model;

import com.employee.employee.respository.model.Employee;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Data
@Component
public class Employees {

    List<Employee> employees = new ArrayList<>();
}

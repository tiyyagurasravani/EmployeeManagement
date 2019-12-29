package com.employee.employee.service;

import com.employee.employee.model.Department;
import com.employee.employee.respository.model.Employee;
import com.employee.employee.respository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeManagementService {

    @Autowired
    public EmployeeDAO employeeDAO;

    public List getAllEmployees() {
        System.out.println("EmployeeDAO::getAllEmployees()");
        List<Employee> employees = new ArrayList();
        // Business Logic goes in this method but since it is a sample demo no business logic relevant here
        employeeDAO.findAll().forEach(emp -> employees.add(emp));
        return employees;
    }

    public void  saveEmployee(Employee employee) {
        employeeDAO.save(employee);
    }

    public com.employee.employee.model.Employee findById(Integer id) {
        Optional<Employee> employee = employeeDAO.findById(id);
        com.employee.employee.model.Employee employee1 = new com.employee.employee.model.Employee();
        employee1.setId(employee.get().getId());
        employee1.setFirstName(employee.get().getFirstName());
        employee1.setLastName(employee.get().getLastName());
        Department department = new Department();
        com.employee.employee.respository.model.Department department1 = employee.get().getDepartment();
        department.setId(department1.getId());
        department.setDepartmentName(department1.getDepartmentName());
        employee1.setDepartment_id(department);
        return employee1;
    }
}

package com.employee.employee.apis;

import com.employee.employee.respository.model.Employee;
import com.employee.employee.service.EmployeeManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmplyeeManagementController {

    @Autowired
    private EmployeeManagementService employeeManagementService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/employees")
    public List getEmployees() {
        System.out.println("EmplyeeManagementController::getEmployees()");
        return employeeManagementService.getAllEmployees();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/employee")
    public com.employee.employee.model.Employee getEmployeeById(@RequestParam(value="id",required = false) Integer id) {
        System.out.println("EmplyeeManagementController::getEmployeeById()" + id);
        return employeeManagementService.findById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/employee")
    public void saveEmployees(@RequestBody Employee employee) {
        System.out.println("EmplyeeManagementController::getEmployees()");
        employeeManagementService.saveEmployee(employee);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/department")
    public List getEmployeeListByName() {
        System.out.println("EmplyeeManagementController::getEmployeeListByName()");
        return employeeManagementService.getAllEmployees();
    }
}

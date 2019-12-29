package com.employee.employee.respository;

import com.employee.employee.respository.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDAO extends CrudRepository<Department, Integer>{
}

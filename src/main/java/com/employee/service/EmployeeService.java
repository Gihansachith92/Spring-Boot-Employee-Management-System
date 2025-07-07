package com.employee.service;


import com.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    void save(Employee employee);

    Employee getById(long id);

    void deleteById(long id);
}

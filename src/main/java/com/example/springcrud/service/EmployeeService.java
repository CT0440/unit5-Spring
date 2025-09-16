package com.example.springcrud.service;

import java.util.List;
import com.example.springcrud.model.Employee;

public interface EmployeeService {
    void save(Employee employee);
    Employee getById(int id);
    List<Employee> getAll();
    void update(Employee employee);
    void delete(int id);
}

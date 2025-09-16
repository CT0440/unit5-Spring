package com.example.springcrud.dao;

import java.util.List;
import com.example.springcrud.model.Employee;

public interface EmployeeDao {
    void save(Employee employee);
    Employee getById(int id);
    List<Employee> getAll();
    void update(Employee employee);
    void delete(int id);
}

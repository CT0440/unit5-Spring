package com.example.springcrud.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.springcrud.dao.EmployeeDao;
import com.example.springcrud.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
        System.out.println("Employee saved successfully: " + employee);
    }

    @Override
    public Employee getById(int id) {
        Employee emp = employeeDao.getById(id);
        System.out.println("Employee fetched: " + emp);
        return emp;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = employeeDao.getAll();
        System.out.println("All Employees fetched, count: " + employees.size());
        return employees;
    }

    @Override
    public void update(Employee employee) {
        employeeDao.update(employee);
        System.out.println("Employee updated: " + employee);
    }

    @Override
    public void delete(int id) {
        employeeDao.delete(id);
        System.out.println("Employee deleted with id: " + id);
    }
}

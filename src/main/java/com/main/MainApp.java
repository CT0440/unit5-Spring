package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springcrud.dao.EmployeeDao;
import com.example.springcrud.model.Employee;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Get the EmployeeDao bean
        EmployeeDao employeeDao = context.getBean("employeeDaoImpl", EmployeeDao.class);

        // Create a new Employee object with your details
        Employee emp = new Employee("Susruthi K", "susruthi123@gmail.com");

        // Save employee to database
        employeeDao.save(emp);

        System.out.println("Employee saved successfully: " + emp);
    }
}

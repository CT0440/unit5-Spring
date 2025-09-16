package com.example.springcrud.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "salary")
    private double salary;

    @Column(name = "email", unique = true)
    private String email;

    // Default constructor
    public Employee() {}

    // Constructor with name and email
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters for all fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
       this.id = id;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public double getSalary() {
       return salary;
    }

    public void setSalary(double salary) {
       this.salary = salary;
    }

    public String getEmail() {
       return email;
    }

    public void setEmail(String email) {
       this.email = email;
    }

    // Override toString for meaningful print
    @Override
    public String toString() {
       return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", salary=" + salary +
               ", email='" + email + '\'' +
               '}';
    }
}

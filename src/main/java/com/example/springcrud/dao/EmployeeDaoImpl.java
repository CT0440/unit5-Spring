package com.example.springcrud.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.springcrud.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(Employee employee) {
        getSession().persist(employee);
    }

    @Override
    public Employee getById(int id) {
        return getSession().get(Employee.class, id);
    }

    @Override
    public List<Employee> getAll() {
        return getSession().createQuery("from Employee", Employee.class).list();
    }

    @Override
    public void update(Employee employee) {
        getSession().merge(employee);
    }

    @Override
    public void delete(int id) {
        Employee emp = getById(id);
        if (emp != null) {
            getSession().remove(emp);
        }
    }
}

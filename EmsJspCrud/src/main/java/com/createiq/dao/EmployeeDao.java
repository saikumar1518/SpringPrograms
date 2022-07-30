package com.createiq.dao;

import java.util.List;

import com.createiq.model.Employee;

public interface EmployeeDao {

	//void save(Employee employee);

	//void update(Employee employee);

	List<Employee> findAll();

	//void delete(int id);
}
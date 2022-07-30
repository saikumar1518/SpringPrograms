package com.createiq.ems.dao;

import java.util.ArrayList;
import java.util.List;

import com.createiq.ems.model.Employee;

public class EmployeedDaoImpl implements EmployeeDao{
	
	private static List<Employee> employees = new ArrayList<Employee>();
	static { 
	employees.add(new Employee(100, "Sai", 2000.00, "sai@gmail.com"));
	employees.add(new Employee(100, "uday", 3000.00, "uday@gmail.com"));
	employees.add(new Employee(100, "Sri", 4000.00, "Sri@gmail.com"));
	employees.add(new Employee(100, "laxman", 50000.00, "laxman@gmail.com"));
	
	
	
	
	}
	public List<Employee> getEmpAll() {
	
		return employees;
	}

}

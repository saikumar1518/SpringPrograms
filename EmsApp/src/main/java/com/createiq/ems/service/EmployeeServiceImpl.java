package com.createiq.ems.service;

import java.util.List;

import com.createiq.ems.dao.EmployeeDao;
import com.createiq.ems.dao.EmployeedDaoImpl;
import com.createiq.ems.model.Employee;

public class EmployeeServiceImpl  implements EmployeeService{
private EmployeeDao dao = new EmployeedDaoImpl();

	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getAll() {
	
		return dao.getEmpAll();
	}

}

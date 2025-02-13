package com.cg.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Employee;
import com.cg.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	public List<Employee> getAllEmployee() {
		return employeerepository.findAll();
	}
	
	
    
}


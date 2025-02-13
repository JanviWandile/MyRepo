package com.cg.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/employee")
	public List<Employee> getEmployee(){
		return employeeservice.getAllEmployee();
		
	}
    
}


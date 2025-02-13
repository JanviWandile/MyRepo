package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Department;
import com.cg.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentrepository;
	public List<Department> getAllDepartments() {
		return departmentrepository.findAll();
	}
}

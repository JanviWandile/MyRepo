package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Department;
import com.cg.feign.DepartmentFeighClient;
import com.cg.service.DepartmentService;

@RestController
public class DepartmentController {
	 @Autowired
	 DepartmentService departmentservice;
	 
	 @Autowired
	 DepartmentFeighClient departmentfeighclient;
	 @GetMapping("/getdepartments")
	 public List<Department> getAllDepartments() {
		 return departmentservice.getAllDepartments();
	 }
	 @GetMapping("/allemp")
	 public ResponseEntity<String> getEmployees(){
		 return ResponseEntity.ok().body(departmentfeighclient.employeeResponse());
	 }
}

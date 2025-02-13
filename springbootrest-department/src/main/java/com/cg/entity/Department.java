package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department_ms")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int depart_id, String name) {
		super();
		this.id = depart_id;
		this.name = name;
	}
	public int getDepart_id() {
		return id;
	}
	public void setDepart_id(int depart_id) {
		this.id = depart_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [d_id=" + id + ", name=" + name + "]";
	}
	
}

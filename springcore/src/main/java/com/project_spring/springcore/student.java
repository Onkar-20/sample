package com.project_spring.springcore;

public class student {

	private String name;
	private String city;
	private String department;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String name, String city, String department, String designation) {
		super();
		this.name = name;
		this.city = city;
		this.department = department;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", city=" + city + ", department=" + department + ", designation="
				+ designation + "]";
	}
	
	

}

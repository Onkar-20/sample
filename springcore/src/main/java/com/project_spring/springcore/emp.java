package com.project_spring.springcore;

public class emp {

	private String name;
	private String city;
	private String department;
	private String designation;
	@Override
	public String toString() {
		return "emp [name=" + name + ", city=" + city + ", department=" + department + ", designation=" + designation
				+ "]";
	}
	public emp(String name, String city, String department, String designation) {
		super();
		this.name = name;
		this.city = city;
		this.department = department;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

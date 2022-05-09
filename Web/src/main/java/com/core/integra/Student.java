package com.core.integra;



public class Student {
	private int id;
	private String firstname;
	private String lastname;
	private String street;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String firstname, String lastname, String street, String city) {
		
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.street = street;
		this.city = city;
	}
	
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}

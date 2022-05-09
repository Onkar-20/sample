package com.core.integra;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class signup {
	
	
	@Id
	private String id;
	private String name;
	private String mob;
	private String city;
	private String email;
	public signup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public signup(String id, String name, String mob, String city, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.city = city;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "signup [id=" + id + ", name=" + name + ", mob=" + mob + ", city=" + city + ", email=" + email + "]";
	}
	

}

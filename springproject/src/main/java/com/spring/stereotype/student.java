package com.spring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class student {
	@Value("onkar")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("solapur")
	private String city;
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", city=" + city + "]";
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}

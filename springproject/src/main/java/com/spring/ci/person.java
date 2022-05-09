package com.spring.ci;

public class person {
	
	private String name;
	private int id;
	
	
	@Override
	public String toString() {
		return "person [name=" + name + ", id=" + id + "]";
	}


	public person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

}
